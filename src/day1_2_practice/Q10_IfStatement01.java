package day1_2_practice;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Y/N ikilisinden birini giriniz");
        String deger=scan.next();

        if (deger.contains("Y")){
            System.out.println("YES");
        }else if (deger.contains("N")){
            System.out.println("NO");
        }else System.out.println("Yanlis deger girdiniz tekraR deneyin");

    }

}

