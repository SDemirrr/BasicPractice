package day3_practice;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime=scan.next();

        System.out.println("Kelimenin tersten yazilisi : "+
                kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1));


    }
}
