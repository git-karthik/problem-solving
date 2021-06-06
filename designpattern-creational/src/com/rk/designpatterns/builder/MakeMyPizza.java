package com.rk.designpatterns.builder;

import java.util.HashSet;
import java.util.Set;

public class MakeMyPizza {
    
    private Set<String> topping;
    private boolean extraCheese;
    private PizzaBase pizzaBase;
    private PizzaSize pizzaSize;

    MakeMyPizza(){
        // default value set
        this.topping = new HashSet<>();
        this.pizzaBase = PizzaBase.THIN_CRUST;
        this.pizzaSize = PizzaSize.MEDIUM;
    }
    
    public MakeMyPizza addTopping(String topping){
        this.topping.add(topping);
        return this;
    }

    public MakeMyPizza addExtraCheese(boolean extraCheese){
        this.extraCheese = extraCheese;
        return this;
    }

    public MakeMyPizza addPizzaBase(PizzaBase pizzaBase){
        this.pizzaBase = pizzaBase;
        return this;
    }

    public MakeMyPizza addPizzaSize(PizzaSize pizzaSize){
        this.pizzaSize = pizzaSize;
        return this;
    }

    public Set<String> getTopping() {
        return topping;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public PizzaBase getPizzaBase() {
        return pizzaBase;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

}
