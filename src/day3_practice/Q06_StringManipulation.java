package day3_practice;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {


        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        String str=scan.nextLine();

        if (str.contains(" ")) {
            System.out.println("Bosluk karakteri icermektedir");

        }else {
            System.out.println("bosluk karakteri icermemektedir");

        }

        if (str.isEmpty()) {
            System.out.println("Girdiginiz karakter bostur ");

        }
        else{
            System.out.println("Girdiginiz karakter bos degildir");
        }


    }
}
