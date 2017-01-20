package org.kleber.loja.model;

public abstract class Model extends Object {
  public abstract Object getId();

  public Boolean equals(Object object) {
    return this.getId().equals(object.getId());
  }

  public abstract String toString();
}
