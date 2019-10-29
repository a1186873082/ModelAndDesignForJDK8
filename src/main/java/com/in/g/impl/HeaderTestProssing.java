package com.in.g.impl;

public class HeaderTestProssing extends ProcessingObj<String> {

    @Override
    protected String handlerWork(String input) {
        return "From Raoul,Mario and Alain:" + input;
    }
}
