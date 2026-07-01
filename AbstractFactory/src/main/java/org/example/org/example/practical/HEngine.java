package org.example.org.example.practical;


public class HEngine implements Engine{

    public HEngine(){
        System.out.println("HEngine");
    }
    @Override
    public String getName() {
        return "Honda Engine";
    }
}
