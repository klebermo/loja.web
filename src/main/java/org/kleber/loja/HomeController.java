package org.kleber.loja;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
      return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @RequestMapping(value = "/categoria")
    public String categoria() {
      return "categoria";
    }

    @RequestMapping(value = "/produto")
    public String produto() {
      return "produto";
    }

    @RequestMapping(value = "/pagina")
    public String pagina() {
      return "pagina";
    }

    @RequestMapping(value = "/cart")
    public String cart() {
      return "cart";
    }

    @RequestMapping(value = "/order")
    public String order() {
      return "order";
    }

    @RequestMapping(value = "/wishlist")
    public String wishlist() {
      return "wishlist";
    }
}
