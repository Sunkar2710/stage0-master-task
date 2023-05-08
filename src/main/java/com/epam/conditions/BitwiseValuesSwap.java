package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        int xor = first ^ second;
        first = first ^ xor;
        second = second ^ xor;
        System.out.println(first);
        System.out.println(second);
    }

}
