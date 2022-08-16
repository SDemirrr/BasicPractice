package day4_practice;

import java.util.Scanner;

public class Q03_MethotCretion {
    public static void main(String[] args) {
             /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....

     Fibonacci dizisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
  */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 47'den bir sayi giriniz");
        int sayi=scan.nextInt();

        fibonacciSayi(sayi);


    }

    public static void fibonacciSayi(int sayi) {

        int sayi1;

        if (sayi<47){
            for (int i = 0; i <sayi ; i++) {
                sayi1=0+1;
                System.out.print(sayi1+"-");
                i+=i;


            }
        }




    }
}
