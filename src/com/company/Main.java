package com.company;

public class Main {

    public static void main(String[] args) {

        // Loop through and print out only the even numbers
        // e.g.
        // Even Number: 96
        // 0     1      0  1        0  1    0 1     0   1
        // twoDimArray = [[13, 45], [26, 22], [19, 24], [20, 30], [90, 12]] // multidimensional arrays. 2 dimensional array
            // 0        1           2       3           4
        //twoDimArray[0][2]

	    int[][] numbers = {{13, 45}, {26, 22}, {19, 24}, {20, 30}, {90, 12}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) { //nested loop
                System.out.println(numbers[i][j]);

            }
            if (i == numbers.length - 1) {
                System.out.println("last termition done");
                break;

            }    System.out.println("One iteration done");
        }
    }
}
