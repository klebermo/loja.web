package org.kleber.loja.model;

import java.util.List;

public abstract class Dao {
  protected Class clazz;

  public Dao(Class clazz) {
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
