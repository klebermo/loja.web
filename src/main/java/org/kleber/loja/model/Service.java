package org.kleber.loja.model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class Service<E> {
  @Autowired
  protected Dao<E> dao;

  protected Class clazz;

  public Service(Class clazz) {
    this.clazz = clazz;
  }

  public void insert(E object) {
    dao.insert(object);
  }

  public void update(E object) {
    dao.update(object);
  }

  public void delete(E object) {
    dao.delete(object);
  }

  public List select(String orderby, String groupby) {
    return dao.select(orderby, groupby);
  }
}
