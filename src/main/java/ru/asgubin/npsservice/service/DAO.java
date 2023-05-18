package ru.asgubin.npsservice.service;

import java.util.List;
import java.util.Optional;

public interface DAO<T, ID> {
    T create(T entity);
    List<T> findAll();
    Optional<T> findById (ID id);
    void deleteById(ID id);
    T update(T entity);
}
