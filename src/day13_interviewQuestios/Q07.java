package day13_interviewQuestios;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Harf giriniz");
        char harf=scan.next().charAt(0);
        int harfSayisi=0;

        for (int i = 0; i <cumle.length() ; i++) {
           if (cumle.charAt(i)==harf){
              harfSayisi+=i;

           }

        }
        System.out.println(harf+" harfi "+cumle+" icerisinde "+ harfSayisi +" defa kullanilmistir");

    }
}
