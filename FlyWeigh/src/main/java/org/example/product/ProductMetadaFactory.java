package org.example.product;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProductMetadaFactory {
    private final Map<String,ProductMetadata> productMetadataMap= new ConcurrentHashMap<>();

    public ProductMetadata getProductMetadat(String brand, String category, String taxcode, String originCountry){
        String key = brand + "|" + category + "|" + taxcode + "|" + originCountry;
        return productMetadataMap.computeIfAbsent(key,
                k-> new ProductMetadata(brand,category,taxcode,originCountry));
    }

    public int getCacheSize(){
        return productMetadataMap.size();
    }

}
