package org.example;

public abstract class DataProcessor {

    public final void process(){
        readData();
        transformData();
        saveData();
    }
    protected abstract void readData();
    protected abstract void transformData();
    protected abstract void saveData();
}
