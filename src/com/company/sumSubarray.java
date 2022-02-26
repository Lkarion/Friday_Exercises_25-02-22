package com.company;

public class sumSubarray {
    public static void main(String[] args) {
        //7.Найти сумму всех значений n-го подмассива двумерного массива
        // public static int sumOfNSubArray(int[][] ints, int n)
        int[][] array2Dim = {{6,42,11,7,1,42},{2,4,3,-2,6,2,7,5}};
        System.out.println("7\n"+getSumSubarray(array2Dim, 0));
    }

    //7
    public static int getSumSubarray(int[][] array, int i){
        int sum = 0;
        for (int elem: array[i]) {
            sum += elem;
        }
        return sum;
    }
}
