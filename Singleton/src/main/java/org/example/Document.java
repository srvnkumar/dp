package org.example;

public class Document {
    private static Document document;

    public static Document getInstance(){
        if(document==null){
            document = new Document();
            System.out.println("Creation of new document");
        }
        return document;
    }
}
