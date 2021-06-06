package com.demo.streams;

import java.util.stream.IntStream;

public class StreamsUsage {
    
    private IntStream intStream;

    private void sumValuesInParallel(int maxValue) {
        intStream = IntStream.rangeClosed(1, maxValue);
        long start = System.nanoTime();
        final int sumValue = intStream.parallel().reduce(0, Integer::sum);
        long consumed = System.nanoTime() - start;
        System.out.println("Sum of Integers in parallel stream-->"+ sumValue+" Process Time (ms)-->"+consumed/1000000);
    }

    private void sumValuesInSingleProcessor(int maxValue) {
        intStream = IntStream.rangeClosed(1, maxValue);
        long start = System.nanoTime();
        final int sumValue = intStream.reduce(0, Integer::sum);
        long consumed = System.nanoTime() - start;
        System.out.println("Sum of Integers in stream-->"+ sumValue+" Process Time (ms)-->"+consumed/1000000);
    }

    public static void main(String[] args) {
        StreamsUsage usage = new StreamsUsage();
        int maxValue = args.length == 0 ? 10 :Integer.parseInt(args[0]);        
        
        usage.sumValuesInSingleProcessor(maxValue);
        usage.sumValuesInParallel(maxValue);
    }
}
