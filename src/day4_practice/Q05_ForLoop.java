package day4_practice;

public class Q05_ForLoop {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        for (int i = 0; i <=255 ; i++) {
            char karakter=(char) i;
            System.out.println(i+"="+karakter);

        }



    }
}
