package com.example.gestion.controller;

import com.example.gestion.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class CrudController <T,ID> {


   @Autowired
    private ICrudService <T,ID> service;

    @GetMapping
    public List<T> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void add(@RequestBody T entity){
        service.add(entity);
    }

    @PutMapping
    public void update(@RequestBody T entity){
        service.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id){
        service.delete(id);
    }
}
