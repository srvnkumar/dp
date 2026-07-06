package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileNode file1 = new FileNode("Resume.pdf");
        FileNode file2 = new FileNode("photo.png");
        FileNode file3 = new FileNode("notes.txt");
        //composite nodes
        FolderNode documents = new FolderNode("Documents");
        FolderNode images = new FolderNode("Images");
        FolderNode root = new FolderNode("Root");

        //Build tree
        documents.addNodes(file2);
        documents.addNodes(file3);
        images.addNodes(file1);
        root.addNodes(documents);
        root.addNodes(images);

        root.show();
    }

}