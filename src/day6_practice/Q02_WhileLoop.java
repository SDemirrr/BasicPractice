package day6_practice;

import java.util.Scanner;

public class Q02_WhileLoop {

     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.println("lutfen bir sayi griniz");
         int girilenSayi= scan.nextInt();



         while (0<girilenSayi){
             if (girilenSayi%2==1){
                 System.out.print(girilenSayi+" ");
             }
             girilenSayi++;
         }

     }


}
