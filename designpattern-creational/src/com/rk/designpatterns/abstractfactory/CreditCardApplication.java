package com.rk.designpatterns.abstractfactory;

import java.util.Scanner;

public class CreditCardApplication {
    
    public static void main(String[] args) {
        Scanner scan = null;
        try {
            System.out.println("Enter your credit card score: ->");
            scan = new Scanner(System.in);
            if(scan.hasNextInt()){
                AbstractCreditCardFactory cardFactory = AbstractCreditCardFactory.getCreditCardFactory(scan.nextInt());
                CreditCard card = cardFactory.getCreditCard(CardType.PLATINUM);
                System.out.println(card);
            }else{
                throw new IllegalArgumentException("Input value is not a number");
            }
            
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        finally{
            scan.close();
        }
        
    }
}
