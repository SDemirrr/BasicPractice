package day3_practice;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyIsim=scan.nextLine();

       if (isim.length()>soyIsim.length()){
           System.out.println(isim+" "+soyIsim+"'den daha uzundur");
       }else if (isim.length()<soyIsim.length()){
            System.out.println(soyIsim+" "+isim+"'den daha uzundur");
        }else {
           System.out.println(isim+" "+soyIsim+" uzunlugu esittir");
       }

    }
}
