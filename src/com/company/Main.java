package com.company;

public class Main {

    public static void main(String[] args) {

//        double centimeters = calcFeetAndInchesToCentimeters(5,2);
//        System.out.println("value in centimeters is: " + centimeters);
//        double feet = calcFeetAndInchesToCentimeters(1);
//        System.out.println("Value of feet inside inches = " + feet );

//       calcFeetAndInchesToCentimeters(1, -1);
//       calcFeetAndInchesToCentimeters(-1);
//        sumOfNumbers(1,1,1);

//      double sum = sumOfNumbers(6, 6, 6, 5, 5);
//
//      sumOfNumbers(6, 6, 6, 6,7);
//      sumOfNumbers(7,6,6,6,5);





    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {

            System.out.println("invalid feet or inches parameters. Try using a positive number.");
            return -1;
        }

        double centimetersFromInches = (inches * 2.54);
        double centimetersFromfeet = (feet * 30.48);
        double centimetersComprised = centimetersFromfeet + centimetersFromInches;

        System.out.println(feet + " feet + " + inches + " inches " + " = " + centimetersComprised + " centimeters ");


        return centimetersComprised;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("invalid feet or inches parameters. Try using a positive number.");
            return -1;
        }

        double feetInInches = (int) inches / 12;
        double rest = inches % 12;

        System.out.println("feet in inches = " + feetInInches);

        return calcFeetAndInchesToCentimeters(feetInInches, rest);
    }

    public static double sumOfNumbers(double numberOne, double numberTwo, double numberThree) {
        double Sum = numberOne + numberTwo + numberThree;
        System.out.println(numberOne + " + " + numberTwo + " + " + numberThree + " = " + Sum);
        return Sum;
    }

    public static double sumOfNumbers(int i2, int i1, int i, double numberOne, double numberTwo) {

        double sum = numberOne + numberTwo+ i2;
        System.out.println(numberOne + " + " + numberTwo + " + " +  " = " + sum);
        return sum;


    }


}