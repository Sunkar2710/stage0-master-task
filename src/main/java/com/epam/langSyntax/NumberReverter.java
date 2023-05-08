package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        System.out.println(String.format("%d%d%d", number % 10, (number / 10) % 10, (number / 100) % 10));
    }
}
