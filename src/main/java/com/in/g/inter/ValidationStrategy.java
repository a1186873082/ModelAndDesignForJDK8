package com.in.g.inter;

@FunctionalInterface
public interface ValidationStrategy {
    boolean execute(String s);
}
