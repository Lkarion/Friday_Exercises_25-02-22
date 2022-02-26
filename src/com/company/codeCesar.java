package com.company;

public class codeCesar {
    public static void main(String[] args) {
        //2.Код Цезаря  это простой метод, использовавшийся Цезарем для передачи
        // шифрованных сообщений своим генералам. Каждая буква заменяется на на другую,
        //находящуюся на N позиций вперед в английском(в нашем случае) алфавите. Например,
        //для сдвига N=5 буква с будет заменена на h. При достижении конца алфавита замена
        // происходит по кругу. т.е. z  будет заменено на е.
        // Напишите этот метод Цезаря
        String str= "acz";
        System.out.println("2 \n"+str+" -> "+ codeCesar(str,5));
    }

    //2
    public static String codeCesar(String str, int n){
        String abc = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        StringBuilder codedStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if (str.charAt(i)== abc.charAt(j)){
                    codedStr.append(abc.charAt(j+n));
                    break;
                }
            }
        }
        return codedStr.toString();
    }

    //2
   /* public static String codeCesar2(String str, int n){

        return codedStr.toString();
    }*/
}
