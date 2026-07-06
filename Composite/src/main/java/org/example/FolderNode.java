package org.example;

import java.util.ArrayList;
import java.util.List;

public class FolderNode implements FileSystemNode{

    private final String name;

    private final List<FileSystemNode> nodes = new ArrayList<>();

    public FolderNode(String name) {
        this.name = name;
    }

    public void addNodes(FileSystemNode node){
        nodes.add(node);
    }

    public void removeNodes(FileSystemNode node){
        nodes.remove(node);
    }


    @Override
    public void show() {
        System.out.println("Folder Name:"+ this.name);
        nodes.forEach(FileSystemNode::show);
    }
}
