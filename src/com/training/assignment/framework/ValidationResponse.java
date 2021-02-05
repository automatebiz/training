package com.training.assignment.framework;

import java.util.HashMap;
import java.util.Map;

public class ValidationResponse {
    private Map<String, ValidationError> errorMap = new HashMap<>();
    private boolean isErrorExists;

    public Map<String, ValidationError> getErrorMap() {
        return errorMap;
    }

    public void addError(ValidationError validationError) {
        errorMap.put(validationError.getField(), validationError);
    }

    public boolean isErrorExists() {
        return errorMap.size() > 0;
    }
}
