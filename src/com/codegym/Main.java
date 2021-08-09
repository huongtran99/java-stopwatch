package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Main.selectionSort();
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

    public static void selectionSort() {
        long array[] = new long[100000];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    long x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
    }
}
