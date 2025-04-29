// Java program to demonstrate multidimensional array
package com.array;

import java.util.Random;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating and initializing the multidimensional array of bytes
        byte [][] array = new byte[][]{
               new byte []{127, 0, -32, 56, 78},
                new byte []{124, 2, 12, 36, 100},
                new byte []{-120, 98, 2, 79, 78},
        };



        // Printing elements of the array to the console
        System.out.print("[\n");
        for (int index = 0; index < array.length; index++) {
            for (int index1 = 0; index1 < array[0].length; index1++){
                System.out.print("[");
                System.out.print(array[index][index1]);
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.print("\n");
        }
        System.out.print(" ]");
    }
}