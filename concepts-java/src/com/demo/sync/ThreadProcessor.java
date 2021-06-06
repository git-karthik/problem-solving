package com.demo.sync;

import java.util.Arrays;
import java.util.List;

import com.demo.binary.BiConverter;

public class ThreadProcessor {

    public static void main(String[] args) {
        MyProcessor proc = new MyProcessor(3);
        BiConverter converter = new BiConverter();
        Thread t1 = new Thread(){
            public void run() {
                int i=0;
                while(i<5){
                    proc.processRequest(i);
                    i++;
                }

                List<String> inputs = Arrays.asList("10","20","30","32","64");
                inputs.forEach(value -> converter.convertNumber2BinaryNotation(Integer.parseInt(value)));
                
            };
        };

        Thread t2 = new Thread(){
            public void run() {
                int i=0;
                while(i<7){
                    proc.processRequest(i*100);
                    i++;
                }

                List<String> inputs = Arrays.asList("200","255","300","176","192");
                inputs.forEach(value -> converter.convertNumber2BinaryNotation(Integer.parseInt(value)));
            };
        };

        t1.start();
        t2.start();

    }

}
