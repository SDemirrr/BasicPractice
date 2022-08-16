package day1_2_practice;

import java.util.Scanner;

public class Q08_Scanner01 {
    public static void main(String[] args) {


    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen iki tamsayi giriniz");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        System.out.println("Toplam : "+(sayi1+sayi2));


}}
