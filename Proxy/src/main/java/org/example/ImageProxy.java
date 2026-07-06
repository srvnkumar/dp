package org.example;

public class ImageProxy implements Image{
    private  RealImage image;
    private final String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(image == null){
            image = new RealImage(fileName);
        }
        System.out.println("Proxy controlling access");
        image.display();
    }
}
