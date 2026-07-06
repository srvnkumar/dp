package org.example.product;

public class Main {
    public static void main(String[] args) {

        ProductMetadaFactory factory = new ProductMetadaFactory();
        ProductMetadata productMetadat = factory.getProductMetadat("Nike", "Shoe", "ABCD", "vietnam");
        ProductMetadata productMetadat2 = factory.getProductMetadat("Nike", "Shoe", "ABCD", "vietnam");

        Product product1 = new Product("SKU1234",1236.0d,12,productMetadat);
        Product product2 = new Product("SKU1235",1214.0d,10,productMetadat2);
        product1.print();
        product2.print();
        System.out.println(factory.getCacheSize());

    }
}
