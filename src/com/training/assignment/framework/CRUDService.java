package com.training.assignment.framework;

import java.util.List;

/**
 * @param <I> ID
 * @param <S> Incoming request object from request controller
 * @param <R> Response Object post entity from repository converted.
 * @author Chandrashekar V
 */
public interface CRUDService<I, S, R> {

    R create(final S s);

    List<R> getAll();

    R update(I id, S s);

    R getById(I id);

    boolean delete(I id);


}
