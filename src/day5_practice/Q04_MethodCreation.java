package day5_practice;

import java.util.Scanner;

public class Q04_MethodCreation {
    public static void main(String[] args) {
        /* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		 Bir dizeyi tersine çevirmek için bir Java programı yazın. for döngüsü kullanın ve adında bir yöntem oluşturun
		  reverseString */


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str=scan.nextLine();

        System.out.println(tersineCevir(str));


    }







    private static String tersineCevir(String str) {
        String kova="";


        for (int i =str.length()-1; i >=0 ; i--) {
          kova+=str.substring(i,i+1);
        }


        return kova;
    }
}
