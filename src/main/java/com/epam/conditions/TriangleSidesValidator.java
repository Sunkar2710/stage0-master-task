package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isTriangle = firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide;
        System.out.println(isTriangle ? "this is a valid triangle" : "it's not a triangle");
    }

}
