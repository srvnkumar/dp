package org.example.product;
//Externsic value
public class Product {
    private final String sku;
    private final double price;
    private final int stock;
    private final ProductMetadata productMetadata;

    public Product(String sku, double price, int stock, ProductMetadata productMetadata) {
        this.sku = sku;
        this.price = price;
        this.stock = stock;
        this.productMetadata = productMetadata;
    }


    public void print(){
        System.out.println(
                "SKU: " + sku +
                            ", Price: " + price +
                            ", Stock: " + stock +
                            ", Brand: " + productMetadata.getBrand() +
                            ", Category: " + productMetadata.getCategory()
                
                );
    }
}
