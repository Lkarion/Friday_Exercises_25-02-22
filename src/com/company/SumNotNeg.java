package com.company;

public class SumNotNeg {
    public static void main(String[] args) {
        //11*  сложить числа в двумерном массиве только из тех подмассивов, где нету отрицательных элементов
        int[][] array2Dim = {{6,42,11,7,1,42},{2,4,3,-2,6,2,7,5}};
        System.out.println("11\nSum of elements in a not negative subarrays = "+getSumNotNeg(array2Dim));
    }

    //11
    static int getSumNotNeg(int[][] array2Dim){
        int sum=0;
        for (int[] arr:array2Dim) {
            if(!checkIfNeg(arr)){
                for (int elem: arr){
                    sum+=elem;
                }
            }
        }
        return sum;
    }

    static boolean checkIfNeg(int[] array){
        for (int i=0; i< array.length; i++){
            if (array[i] < 0) return true;
        }
        return false;
    }

}
