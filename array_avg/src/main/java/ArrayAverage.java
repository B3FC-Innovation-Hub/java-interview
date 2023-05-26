package main.java;

public class ArrayAverage {

    public static double calculateDoubleAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return  (double) sum / arr.length * 2;
    }

    public static void main(String[] args) {

        int[][] arrays = {
            { 33, 34 },
            { 78, 79, 78, 79, 78, 79, 78, 79 },
            { 18, 19, 20, 21 },
            { 19, 20 },
            { 45, 46, 44, 46, 45, 46 },
            { 99, 100, 99, 100, 99, 100, 99, 100, 99, 100 },
            { 435, 436 }
        };
        //write an array of expected values which is the double of each of the above averages
        int[] expected = { 67, 157, 39, 39, 91, 199, 871 };

        for (int i = 0; i < arrays.length; i++) {
            double avg = calculateDoubleAverage(arrays[i]);
            System.out.println("Array " + (i + 1) + " average: " + avg +"\t"+(avg == expected[i] ? "\u2713" : "\u2717"));
        }
    }
}