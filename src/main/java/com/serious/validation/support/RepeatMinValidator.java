package com.serious.validation.support;

import com.google.common.base.Preconditions;
import com.serious.validation.AbstractValidator;

import java.util.Collection;

/**
 * Created by Serious on 2017/6/28.
 */
public class RepeatMinValidator extends AbstractValidator {

    @Override
    protected void doValidate(Object fieldValue, Object extensionValue, String errInfo) {
        Long extensionValueLong = (Long) extensionValue;
        Collection fieldValueCol = (Collection) fieldValue;
        String err = errInfo + "error with RepeatMin";
        Preconditions.checkArgument(fieldValueCol.size() > extensionValueLong, err);
    }
}
