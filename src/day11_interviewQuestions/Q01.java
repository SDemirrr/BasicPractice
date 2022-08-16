package day11_interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");

         String str=scan.nextLine().replaceAll( " ","");
         String[] arr= str.split("");
          Arrays.sort(arr);
          int sayac=0;


        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].equals(arr[i+1])) {
                sayac++;
            } else{
                System.out.println(arr[i-1]+": karakter sayisi "+(sayac+1));
                sayac=0;
            }
            if (i==arr.length-1){
                System.out.println(arr[i-1]+": karakter sayisi "+(sayac+1));
            }

        }

    }



}
