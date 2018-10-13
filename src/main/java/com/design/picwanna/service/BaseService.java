package com.design.picwanna.service;


import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<T, ID> {
    T saveAndFlush(T record);

    void deleteById(ID id);

    Optional<T> findById(ID id);

    List<T> findAll();

    T save(T record);
}
