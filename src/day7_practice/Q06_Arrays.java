package day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {

       /*

    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
       public static void main(String[] args) {

              arrayOlustur();





}

       private static void arrayOlustur() {
              Scanner scan=new Scanner(System.in);
              System.out.print("arrayin uzunlugunu giriniz : ");
              int uzunluk=scan.nextInt();
              int arr[]=new int[uzunluk];

              for (int i = 0; i <uzunluk ; i++) {
                     System.out.print("arrayin "+(i+1)+". elemanini giriniz : ");
                     arr[i]=scan.nextInt();
              }

              Arrays.sort(arr);
              System.out.println("Arrayedeki en buyuk eleman ile en kucuk eleman arasindaki fark ="+(arr[uzunluk-1]-arr[0]));

              /*
              bu soruyu Math classi kullanarak cozunuz
               */




       }
}
