package day3_practice;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 1. kelimeyi giriniz");
        String kelime1=scanner.nextLine().toLowerCase();
        System.out.println("Lutfen 2. kelimeyi giriniz");
        String kelime2=scanner.nextLine().toLowerCase();
        System.out.println("Lutfen 3. kelimeyi giriniz");
        String kelime3=scanner.nextLine().toLowerCase();
        System.out.println("Lutfen 4. kelimeyi giriniz");
        String kelime4=scanner.nextLine().toLowerCase();

        System.out.println(kelime1.substring(0,1).toUpperCase()+
                kelime1.substring(1).concat(" ") +
                kelime2.concat(" ") +
                kelime3.concat(" ") +
                kelime4.concat("."));


    }
}
