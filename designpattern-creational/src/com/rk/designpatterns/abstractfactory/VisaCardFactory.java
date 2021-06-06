package com.rk.designpatterns.abstractfactory;

public class VisaCardFactory extends AbstractCreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new VisaPlatinumCreditCard();
            
            case TITANIUM:
                return new VisaTitaniumCreditCard();
        
            default:
                return new VisaGoldCreditCard();
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        switch (cardType) {
            case PLATINUM:
                return new VisaPlatinumValidator();

            case TITANIUM:
                return new VisaTitaniumValidator(); 
                
            default:
                return new VisaGoldValidator();
        }
    }

}
