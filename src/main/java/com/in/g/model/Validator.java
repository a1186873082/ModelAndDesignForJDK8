package com.in.g.model;

import com.in.g.inter.ValidationStrategy;

/**
 * 验证策略模式
 */
public class Validator {
    private ValidationStrategy validationStrategy;

    public Validator(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validate(String s){
        return validationStrategy.execute(s);
    }
}
