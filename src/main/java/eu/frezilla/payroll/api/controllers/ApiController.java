package eu.frezilla.payroll.api.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ApiController<T extends Object, ID extends Object> {

    @PostMapping
    T create(@RequestBody T object);
    
    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);
    
    @GetMapping
    List<T> findAll();
    
    @GetMapping("{id}")
    T findByKey(@PathVariable ID id);
    
    @PutMapping("{id}")
    T replace(@RequestBody T object, @PathVariable ID id);
    
    
}
