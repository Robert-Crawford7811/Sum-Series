/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */

public class SumSeries {
     public static double m(double i) { // Computing the series
        if (i == 0)
            return 0;
        else
            return i / (2 * i + 1) + m(i - 1);
     }
    public static void main(String[] args) { // Printing the sum of the series
      System.out.println("Sum of the series is: " + m(10));
    }
    }
