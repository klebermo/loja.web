package org.kleber.loja.model.usuario;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDao extends org.kleber.loja.model.Dao<Usuario> {
  public UsuarioDao() {
    super(Usuario.class);
  }
}
