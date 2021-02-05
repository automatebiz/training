package com.training.assignment.repository;

public class RepositoryLayerException extends Exception {
    public RepositoryLayerException() {
    }

    public RepositoryLayerException(String message) {
        super(message);
    }

    public RepositoryLayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepositoryLayerException(Throwable cause) {
        super(cause);
    }

    public RepositoryLayerException(String message, Throwable cause, boolean enableSuppression,
                                    boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
