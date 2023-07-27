package org.kleber.loja.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class Controller<E> {
  @Autowired
  protected Service<E> serv;

  protected Class<?> clazz;

  public Controller(Class<?> clazz) {
    this.clazz = clazz;
  }

  @RequestMapping(value="/insert", method=RequestMethod.POST)
  public void insert(@Valid E object, BindingResult result) {
    serv.insert(object);
  }

  @RequestMapping(value="/insert")
  public String insert(Model model) {
    return "form/insert";
  }

  @RequestMapping(value="/update", method=RequestMethod.POST)
  public void update(@Valid E object, BindingResult result) {
    serv.update(object);
  }

  @RequestMapping(value="/update/{id}")
  public String update(Model model, @PathVariable("id") String id) {
    return "form/update";
  }

  @RequestMapping(value="/delete", method=RequestMethod.POST)
  public void delete(@Valid E object, BindingResult result) {
    serv.delete(object);
  }

  @RequestMapping(value="/delete/{id}")
  public String delete(Model model, @PathVariable("id") String id) {
    return "form/delete";
  }

  @RequestMapping(value = "lista.json")
  @ResponseBody
  public String select(String orderby, String groupby) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    return mapper.writeValueAsString(serv.select(orderby, groupby));
  }

  @RequestMapping(value="/")
  public String select(Model model) {
    return "home/"+clazz.getSimpleName();
  }
}
