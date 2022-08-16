package day3_practice;

import java.util.Scanner;

public class Q08_MethodCreation {
    public static void main(String[] args) {

         /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

       Scanner scanner=new Scanner(System.in);
        System.out.println("carpma yapmak icin *\nbolme yapmak icin /\ntoplama yapmak icin +\ncikarma yapmak icin -\ngiriniz");
        String islem=scanner.next();
        System.out.println("Birinci sayiyi giriniz");
        int sayi1=scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2=scanner.nextInt();

        hesapMakinasi(islem,sayi1,sayi2);


    }

    public static void hesapMakinasi(String islem,int sayi1, int sayi2) {

        if (!(islem.equals("*")||islem.equals("/")||islem.equals("+")||islem.equals("-"))) {
            System.out.println("Hatali karakter girdiniz tekrar deneyin");

        }else if (islem.equals("*")){
            System.out.println("sonuc="+(sayi1*sayi2));
        } else if (islem.equals("/")) {
            System.out.println("sonuc="+(sayi1/sayi2));

        } else if (islem.equals("+")) {
            System.out.println("sonuc="+(sayi1+sayi2));

        } else if (islem.equals("-")) {
            System.out.println("sonuc="+(sayi1-sayi2));

        }
        }

    }

