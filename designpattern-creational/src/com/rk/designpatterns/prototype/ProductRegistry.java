package com.rk.designpatterns.prototype;

import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class ProductRegistry {
    
    private Map<String, BaseProduct> products = new LinkedHashMap<>();

    ProductRegistry(){
        loadProducts();
    }

    public BaseProduct createProduct(String type){

        BaseProduct product = null;
        try {
            product = (BaseProduct) products.get(type).clone();
        } catch (CloneNotSupportedException e) {
           e.printStackTrace();
        }

        return product;
    }

    private void loadProducts() {
        FoodProduct food = new FoodProduct();
        food.setProductName("Cadbury Dairy Milk");
        food.setProductCode("CDB-Chocolate");
        food.setProductPrice(110.00);
        food.setCurrency(Currency.getInstance(Locale.getDefault()).getCurrencyCode());
        food.addIngredients("Milk");
        food.addIngredients("Nuts");
        food.addIngredients("Sugar");
        food.addNutrition("Carbohydrates", "110KCal");
        food.addNutrition("Protein", "4g");

        products.put("Food", food);

        UtilityProduct utility = new UtilityProduct();
        utility.setProductName("Samsung Frost Free Refrigerator - 300L");
        utility.setProductCode("HSE-Electronics");
        utility.setManufacturer("Samsung Electronics Ltd.,");
        utility.setProductPrice(35500.00);
        utility.setCurrency(Currency.getInstance(Locale.getDefault()).getCurrencyCode());
        utility.setWarranty("2 years");

        products.put("Utility", utility);

    }

}
