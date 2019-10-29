package com.in.g.impl;

import com.in.g.inter.ValidationStrategy;

public class IsAllLowerCase implements ValidationStrategy {
    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
