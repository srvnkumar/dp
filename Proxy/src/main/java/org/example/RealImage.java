package org.example;

public class RealImage implements Image{

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); //costly operation
    }

    private void loadFromDisk() {
        System.out.println("Loading from disk "+fileName);
    }


    @Override
    public void display() {
        System.out.println("Displaying image "+ fileName);
    }
}
