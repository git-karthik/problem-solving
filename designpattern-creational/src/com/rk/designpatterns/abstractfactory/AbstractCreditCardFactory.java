package com.rk.designpatterns.abstractfactory;

public abstract class AbstractCreditCardFactory {
    
    public static AbstractCreditCardFactory getCreditCardFactory(int creditScore){

        if(creditScore > 600){
            return new AmexCardFactory();
        }
        else
        {
            return new VisaCardFactory();
        }

    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
