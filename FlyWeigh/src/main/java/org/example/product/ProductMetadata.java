package org.example.product;
//Instrinc state (shared)
public class ProductMetadata {
    private final String brand;

    private final String category;

    private final String taxcode;

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }


    private final String originCountry;

    public ProductMetadata(String brand, String category, String taxcode, String originCountry) {
        this.brand = brand;
        this.category = category;
        this.taxcode = taxcode;
        this.originCountry = originCountry;
    }


}
