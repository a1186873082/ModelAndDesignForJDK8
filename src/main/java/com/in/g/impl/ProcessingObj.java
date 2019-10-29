package com.in.g.impl;

public abstract class ProcessingObj<T> {
    protected ProcessingObj<T> processingObj;

    public void setSuccessObj(ProcessingObj<T> successObj) {
        this.processingObj = successObj;
    }

    public T handler(T input) {
        T r = handlerWork(input);
        if (processingObj != null){
            return processingObj.handler(input);
        }
        return r;
    }

    abstract protected T handlerWork(T input);
}
