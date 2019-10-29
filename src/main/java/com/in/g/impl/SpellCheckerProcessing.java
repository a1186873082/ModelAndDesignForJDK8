package com.in.g.impl;

public class SpellCheckerProcessing extends ProcessingObj<String> {

    @Override
    protected String handlerWork(String input) {
        return input.replaceAll("labda", "lambda");
    }
}
