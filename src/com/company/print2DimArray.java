package com.company;

public class print2DimArray {
    public static void main(String[] args) {
        //8.вывести на экран все значения двумерного массива
        // public static void print2Dim(int[][] array)
        int[][] array2Dim = {{6,42,11,7,1,42},{2,4,3,-2,6,2,7,5}};
        System.out.println("8\n");
        print2DimArray(array2Dim);
    }

    //8
    public static void print2DimArray(int[][] array2Dim){
        for (int[] array: array2Dim) {
            for (int elem: array) {
                System.out.print(elem+"\t");
            }
            System.out.println();
        }
    }

}
