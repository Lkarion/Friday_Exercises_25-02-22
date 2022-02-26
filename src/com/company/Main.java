package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// 1. написать метод, убирающий заданную букву из строки
        String str= "acz";
        System.out.println(removeChar(str,'a'));

    }

    //1
    private static String removeChar(String str, char a) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != a)
                s1.append(str.charAt(i));
        }
        return s1.toString();
    }
}
