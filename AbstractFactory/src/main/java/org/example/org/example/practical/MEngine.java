package org.example.org.example.practical;


public class MEngine implements Engine{
    public MEngine(){
        System.out.println("MEngine");
    }

    @Override
    public String getName() {
        return "Marutin Engine";
    }
}
