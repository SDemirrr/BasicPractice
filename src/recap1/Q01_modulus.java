package recap1;

import java.util.Scanner;

public class Q01_modulus {
    public static void main(String[] args) {

        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("5 basamkli bir sayi giriniz");
        int sayi= scan.nextInt();

      int ilkiki=  sayi/1000;
      int soniiki=sayi%100;

        System.out.println(ilkiki/10+ilkiki%10+soniiki/10+soniiki%10);






    }
}
