package com.company;

public class NotNegSubarrays {
    public static void main(String[] args) {
        //10. метод принимает двумерный массив и возвращает количество подмассивов(строк), в которых нет отрицательных
        // элементов public static int method(int[][]array)
        int[][] array2Dim = {{6,42,11,7,1,42},{2,4,3,-2,6,2,7,5}};
        System.out.println("10\n"+getNotNegSubarrays(array2Dim)+" subarrays with no negative elements");
    }

    //10
    static int getNotNegSubarrays(int[][] array2Dim){
        int count=0;
        for (int[] arr:array2Dim) {
            if (!checkIfNeg(arr)) count++;
        }
        return count;
    }
    static boolean checkIfNeg(int[] array){
        for (int i=0; i< array.length; i++){
            if (array[i] < 0) return true;
        }
        return false;
    }
}
