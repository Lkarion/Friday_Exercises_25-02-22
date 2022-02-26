package com.company;

public class VasyPetyaFavoriteNumbers {
    public static void main(String[] args) {
        //6* Есть массив целых чисел больше нуля. Вася и Петя задумывают по одному числу.
        // Найти наибольшую длину подмассива этого массива, такого что этот подмассив содержит поровну любимого
        // числа Васи и Пети. Если такого подмассива не существует, вернуть 0. Подмассив имеется в виду часть
        // массива от нулевого элемента и дальше.
        //например: (7, 42)->  {6,42,11,7,1,42}-> 5, (7,42)-> {7,42,11,7,1,42}-> 6
        int[] array = {6,42,11,7,1,42};
        // System.out.println(Arrays.toString(findSubArray(array, 7, 42)));
    }

    //6
    public static int[] findSubArray(int[] array, int numVasya, int numPetya){
        ArrayList<Integer> subArray = new ArrayList<>();

    }
}
