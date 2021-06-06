package com.rk.designpatterns.builder;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A model class to showcase Builder Pattern: A Java creation design pattern.
 */
public class BuilderModel {

    enum PizzaBase {THIN_CRUST, FLUFFY_PAN, HAND_TOSSED};

    public static class PizzaBuilder{

        private Set<String> topping;
        private boolean extraCheese;
        private PizzaBase pizzaBase;

        PizzaBuilder(){
            topping = new LinkedHashSet<>();
            pizzaBase = PizzaBase.THIN_CRUST;
        }

        public BuilderModel buildPizza(){
            return new BuilderModel(this);
        }

        public PizzaBuilder addTopping(String topping){
            this.topping.add(topping);
            return this;
        }

        public PizzaBuilder addExtraCheese(boolean extraCheese){
            this.extraCheese = extraCheese;
            return this;
        }

        public PizzaBuilder addPizzaBase(PizzaBase pizzaBase){
            this.pizzaBase = pizzaBase;
            return this;
        }

    } 

    private final Set<String> topping;
    private final boolean extraCheese;
    private final PizzaBase pizzaBase;

    private BuilderModel(PizzaBuilder pizzaBuilder){
        this.topping = pizzaBuilder.topping;
        this.extraCheese = pizzaBuilder.extraCheese;
        this.pizzaBase = pizzaBuilder.pizzaBase;
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
    
}
