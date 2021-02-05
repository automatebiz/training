package com.training.assignment.repository;

import com.training.assignment.exception.ValidationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @param <K>
 * @param <T>
 * @author Chandrashekar V
 */
public abstract class AbstractRepository<K, T> {

    public abstract Map<K, T> data();

    public List<T> fetchAll() {
        return new ArrayList<>(data().values());
    }

    public T save(T t) {

        final K uniqueIdentifier = generateId();
        return data().put(uniqueIdentifier, t);
    }

    protected abstract K generateId();

    public T retrieve(final int key) {
        return data().get(key);
    }

    public boolean delete(int id) {
        if (data().containsKey(id)) {
            final T t = data().remove(id);
            return null != t;
        }
        throw new ValidationException("Id not found to delete");
    }
}
