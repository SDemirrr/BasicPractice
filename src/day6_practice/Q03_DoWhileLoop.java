package day6_practice;

import java.util.Scanner;

public class Q03_DoWhileLoop {

      /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
      public static void main(String[] args) {

          Scanner scan=new Scanner(System.in);

          char karakter =scan.next().charAt(0);




         while (karakter != 'x'){
        System.out.println("lutfen bir karakter griniz");
        karakter=scan.next().charAt(0);
         }
          System.out.println("Tebrikler klavyede x i bulmayi basarabildiniz");
      }
}
