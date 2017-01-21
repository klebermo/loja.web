package org.kleber.loja.model.usuario;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends org.kleber.loja.model.Service<Usuario> {
  public UsuarioService() {
    super(Usuario.class);
  }
}
