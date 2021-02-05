package com.training.assignment.model;

/**
 * @author Chandrashekar V
 *
 * @param <T>
 */
public class Response<T> {
    private final String message;
    private final boolean isSuccess;
    private T data;

    public Response(String message, boolean isSuccess) {
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public Response(String message, boolean isSuccess, T data) {
        this.message = message;
        this.isSuccess = isSuccess;
        this.data = data;
    }

    public static Response<Void> defaultErrorResponse(final String message) {
        return new Response<Void>(message, false);
    }

    public static <T> Response<T> defaultSuccessResponse(final T employeeResponseDTO,
                                                         final String successMessage) {
        return new Response<>(successMessage, true, employeeResponseDTO);
    }

    public static <T> Response<T> defaultErrorResponse(String errorMessage, T data) {
        return new Response<>(errorMessage, false, data);
    }


    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
