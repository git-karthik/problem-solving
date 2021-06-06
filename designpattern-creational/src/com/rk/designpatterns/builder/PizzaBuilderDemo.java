package com.rk.designpatterns.builder;

public class PizzaBuilderDemo {

    public static void main(String[] args) {
        BuilderModel.PizzaBuilder pizzaBuilder = new BuilderModel.PizzaBuilder();
        
        BuilderModel builderModel = pizzaBuilder.addTopping("Tomatoes")
                    .addTopping("Onions")
                    .addTopping("Olives")
                    .addTopping("Red Paprika")
                    .addExtraCheese(true)
                    .addPizzaBase(BuilderModel.PizzaBase.HAND_TOSSED)
                    .buildPizza();
        
        System.out.println(builderModel.getPizzaBase());      
        
        MakeMyPizza pizza = new MakeMyPizza();
        pizza.addPizzaSize(PizzaSize.LARGE)
            .addPizzaBase(PizzaBase.HAND_TOSSED)
            .addExtraCheese(true)
            .addTopping("Paneer")
            .addTopping("Mushrooms");

        System.out.println(pizza.getTopping());
    }
    
}
