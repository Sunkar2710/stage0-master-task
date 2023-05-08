package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int baseWidth = cathetusLength * 2;
        for (int y = 1; y <= cathetusLength; y++) {
            for (int x = baseWidth / 2; x >= 1; x--) {
                if (x >= 1 && x <= y) {
                    System.out.print(x);
                    continue;
                }
                System.out.print(" ");
            }
            for (int x = 1; x < y; x++) {
                System.out.print(x + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
