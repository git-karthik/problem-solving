package com.rk.designpatterns.abstractfactory;

public class AmexCardFactory extends AbstractCreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            
            case TITANIUM:
                return new AmexTitaniumCreditCard();
        
            default:
                return new AmexGoldCreditCard();
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new AmexPlatinumValidator();

            case TITANIUM:
                return new AmexTitaniumValidator(); 
                
            default:
                return new AmexGoldValidator();
        }
    }

    
}
