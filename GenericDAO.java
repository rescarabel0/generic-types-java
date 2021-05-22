package br.org.genericTypes;

import java.util.List;

public interface GenericDAO<T, K> {
    public void insert(T object);
    public T findOne(K primaryKey);
    public List<T> findAll();
    public int update(K primaryKey, T newObject);
    public void remove(K primaryKey);
}
