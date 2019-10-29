package com.in.g.impl;

import com.in.g.inter.ValidationStrategy;

public class IsNumberic implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("\\d+");
    }
}
