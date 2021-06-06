package com.rk.designpatterns.prototype;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FoodProduct extends BaseProduct {
    private Set<String> ingredients;
    private Map<String, String> nutritionValue;

    FoodProduct(){
        this.ingredients = new HashSet<>();
        this.nutritionValue = new HashMap<>();
    }

    public Set<String> getIngredients() {
        return ingredients;
    }

    public Map<String, String> getNutritionValue() {
        return nutritionValue;
    }

    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }

    public void addNutrition(String nutrition, String value){
        this.nutritionValue.putIfAbsent(nutrition, value);
    }

    @Override
    public String toString() {
        Map<String, String> foodAsString = new HashMap<>();
        foodAsString.put("Product Code", this.getProductCode());
        foodAsString.put("Product Name", this.getProductName());
        foodAsString.put("Product Price", String.valueOf(this.getProductPrice()));
        foodAsString.put("Currency", this.getCurrency());
        foodAsString.put("Ingredients", this.ingredients.toString());
        foodAsString.put("Nutrition", this.nutritionValue.toString());
        
        return foodAsString.toString();
    }
}
