package com.example.gestion.service;


import java.util.List;
public interface ICrudService<T,ID>  {
    List <T> getAll();
    void add(T entity);
    void update(T entity);
    void delete(ID id);
}
