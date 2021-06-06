package com.demo.binary;

/**
 * BiConverter
 */
public class BiConverter {
    public static void main(String[] args) {
        BiConverter converter = new BiConverter();
        if(args.length == 0){
            throw new IllegalArgumentException("Required Input to convert");
        }
        isNumberParseable(args[0]);
        //Convert to Binary
        converter.convertNumber2BinaryNotation(Integer.parseInt(args[0]));
        
    }

    private static void convert2Binary(int num, StringBuffer bf){        
        if(num != 0){
            bf.append(num%2);
            convert2Binary(num/2, bf);
        }
    }

    public synchronized void convertNumber2BinaryNotation(int num) {
        final int inputValue = num;
        StringBuffer bf = new StringBuffer(); 
        convert2Binary(num, bf);      
        System.out.println("Binary value of "+inputValue+"is-->"+bf.reverse());        
    }


    private static boolean isNumberParseable(String num){
        try {
            Integer.parseInt(num);            
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }
}