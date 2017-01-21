package org.kleber.loja.model.usuario;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController extends org.kleber.loja.model.Controller<Usuario> {
  public UsuarioController() {
    super(Usuario.class);
  }
}
