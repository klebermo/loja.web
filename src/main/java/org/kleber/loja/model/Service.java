package org.kleber.loja.model;

import java.util.List;

public abstract class Service {
  protected Class clazz;

  public Service(Class clazz) {
    this.clazz = clazz;
  }

  public void insert() {
    //
  }

  public void update() {
    //
  }

  public void delete() {
    //
  }

  public List select(String orderby, String groupby) {
    return null;
  }
}
