package org.kleber.loja.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class Dao<E> {
  protected Class clazz;

  public Dao(Class clazz) {
    this.clazz = clazz;
  }

  public void insert(E object) {
    //
  }

  public void update(E object) {
    //
  }

  public void delete(E object) {
    //
  }

  public List select(String orderby, String groupby) {
    return null;
  }
}
