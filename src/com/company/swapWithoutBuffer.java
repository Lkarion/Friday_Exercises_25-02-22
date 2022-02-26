package com.company;

public class swapWithoutBuffer {
    public static void main(String[] args) {
        //3. Напишите метод для перестановки значений двух переменных без использования
        // третьей. public static void swapWithoutBuffer(int a, int b) -> на экран должно быть выведены новые
        // значения где а=b,b=a но заводить новые переменные в методе нельзя
        int a = 5, b=10;
        swapWithoutBuffer(a,b);
    }

    //3
    public static void swapWithoutBuffer(int a, int b){
        // System.out.println("a = "+b);
        // System.out.println("b = "+a);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a+" ; b = "+b);
    }
}
