package org.kleber.loja.model;

public abstract class Controller {
  protected Class clazz;

  public Controller(Class clazz) {
    this.clazz = clazz;
  }

  public void insert() {
    //
  }

  public String insert() {
    return "form/insert";
  }

  public void update() {
    //
  }

  public String update() {
    return "form/update";
  }

  public void delete() {
    //
  }

  public String delete() {
    return "form/delete";
  }

  public String select(String orderby, String groupby) {
    return null;
  }

  public String select() {
    return "home/"+clazz.getSimpleName();
  }
}
