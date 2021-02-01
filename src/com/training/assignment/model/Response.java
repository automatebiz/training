package com.training.assignment.model;

public class Response<T> {
    private String message;
    private boolean isSuccess;
    private T data;

    public Response(String message, boolean isSuccess) {
        this.message = message;
        this.isSuccess = isSuccess;
    }

    public void setData(T data) {
        this.data = data;
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
}
