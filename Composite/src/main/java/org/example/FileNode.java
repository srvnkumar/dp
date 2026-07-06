package org.example;

public class FileNode implements FileSystemNode{
    private final String fileName;

    public FileNode(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        System.out.println("File is:"+ fileName);
    }
}
