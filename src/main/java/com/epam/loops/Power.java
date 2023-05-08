package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int pow = 1;
        for (int i = 0; i < power; i++) {
            pow *= numberToPrint;
        }
        System.out.println(pow);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
