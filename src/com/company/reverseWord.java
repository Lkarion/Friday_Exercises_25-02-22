package com.company;

public class reverseWord {
    public static void main(String[] args) {
        //5. Развернуть порядок слов в строке. т.е. Hello World -> World Hello
        String s = "Hello World again";
        System.out.println("5\n"+s+" -> " + reverseWord(s));
    }

    //5
    public static String reverseWord(String s){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >0; i--) {
            sb.append(arr[i]).append(' ');
        }
        return sb.append(arr[0]).toString();
    }
}
