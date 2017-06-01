package com.huang.base.dto.validate.validator;

import com.huang.base.dto.validate.annotation.IntEqual;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by huang on 2017/6/1.
 */
public class IntEqualValidator implements ConstraintValidator<IntEqual, Integer> {

    int value;

    @Override
    public void initialize(IntEqual constraintAnnotation) {
        this.value = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        return value == this.value;
    }
}
