package com.company;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        // 4.Подсчитать и вывести на экран количество гласных и согласных букв в слове на английском языке,
        // состоящем из маленьких букв  public static void numberOfVowelsAndConsonants(String string)
        String str= "Hello world";
        numberOfVowelsAndConsonants(str);
    }

    //4
    public static void numberOfVowelsAndConsonants(String string){
        int vowelsCount=0, consonantsCount=0;
        String vowels = "aeiouy", consonants = "abcdfghjklmnpqrstvwxz";
        for (int i = 0; i < string.length(); i++) {
            if (ifContains(consonants, string.charAt(i)))
                consonantsCount++;
            if (ifContains(vowels, string.charAt(i))) vowelsCount++;
        }
        System.out.println("4\n"+ string +"\nvowelsCount = "+ vowelsCount+"\nconsonantsCount = "+ consonantsCount);
    }
    public static boolean ifContains(String letters, char ch){
        for (int i = 0; i < letters.length(); i++) {
            if (ch == letters.charAt(i)) return true;
        }
        return false;
    }
}
