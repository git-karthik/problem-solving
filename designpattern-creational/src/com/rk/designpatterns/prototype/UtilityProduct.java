package com.rk.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class UtilityProduct extends BaseProduct{
    
    private String manufacturer;
    private String warranty;

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getWarranty() {
        return warranty;
    }
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        Map<String, String> productAsString = new HashMap<>();
        productAsString.put("Product Code", this.getProductCode());
        productAsString.put("Product Name", this.getProductName());
        productAsString.put("Product Price", String.valueOf(this.getProductPrice()));
        productAsString.put("Currency", this.getCurrency());
        productAsString.put("Manufacturer", this.manufacturer);
        productAsString.put("Warranty", this.warranty);
        
        return productAsString.toString();
    }

}
