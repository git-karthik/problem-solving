package com.rk.designpatterns.prototype;

public class PrototypeModelDemo {

    public static void main(String[] args) {
        ProductRegistry registry = new ProductRegistry();

        FoodProduct product1 = (FoodProduct) registry.createProduct("Food");
        System.out.println(product1);

        UtilityProduct product2 = (UtilityProduct) registry.createProduct("Utility");
        System.out.println(product2);

        FoodProduct product3 = (FoodProduct) registry.createProduct("Food");
        product3.setProductName("Nestle KitKat");
        product3.setProductCode("NSL-Chocolate");
        product3.addIngredients("Animal Fat");
        System.out.println(product3);

        System.out.println("Are the two food product instances equal.?-->"+product1.equals(product3));
    }
}
