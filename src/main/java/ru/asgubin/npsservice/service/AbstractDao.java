package ru.asgubin.npsservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class AbstractDao <T, ID, R extends JpaRepository<T, ID>> implements DAO<T, ID> {

    public final R repository;

    protected AbstractDao(R repository) {
        this.repository =repository;
    }

    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public T update(final T entity) {
        return repository.save(entity);
    }
}
