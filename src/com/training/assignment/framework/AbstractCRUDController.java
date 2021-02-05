package com.training.assignment.framework;

import com.training.assignment.model.Response;

import java.util.List;

/**
 * @param <I> ID
 * @param <S> Request Model Object, that extends BaseModel
 * @param <R> Response Object that extends ResponseDTO
 *
 * @author Chandrashekar V
 */
public abstract class AbstractCRUDController<I, S extends BaseModel, R extends ResponseDTO> {

    public Response create(S s) {
        final ValidationResponse validate = s.validate();
        if (validate.isErrorExists())
            return Response.defaultErrorResponse("Invalid data", validate.getErrorMap());

        final R r = service().create(s);

        return Response.defaultSuccessResponse(r, "Created successfully!");
    }

    public <I> Response update(I id, S s) {
        final ValidationResponse validate = s.validate();
        if (validate.isErrorExists())
            return Response.defaultErrorResponse("Invalid data", validate.getErrorMap());

        final R r = service().update(id, s);
        return Response.defaultSuccessResponse(r, "Updated successfully!");
    }

    public <I> Response delete(I id) {
        final Boolean r = service().delete(id);
        return Response.defaultSuccessResponse(r, "Deleted successfully!");
    }

    public Response listAll() {
        final List<R> all = service().getAll();
        return Response.defaultSuccessResponse(all, "Retrieved successfully!");
    }

    public <I> Response byId(I id) {
        final R r = service().getById(id);
        return Response.defaultSuccessResponse(r, "Retrieved successfully!");
    }

    public abstract <I> CRUDService<I, S, R> service();
}
