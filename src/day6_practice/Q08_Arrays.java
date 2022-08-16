package day6_practice;

import java.util.Scanner;

public class Q08_Arrays {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);

         int[] arr =new int[8];
         int sayac=0;

         for (int i = 0; i < arr.length ; i++) {
             System.out.println(i+" indexdeki sayiyi giriniz");
             arr[i] =scan.nextInt();
             if (arr[i]%3==0){
                 sayac++;
             }
         }
         System.out.println("3'e bulenebilen sayilar="+sayac);


     }
}
