package day13_interviewQuestios;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Q01 {
  public static void main(String[] args) {

    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */

    Scanner scan=new Scanner(System.in);
    System.out.println("Bir sayi giriniz");
    try {
      int sayi=scan.nextInt();

    int sayiKuplerToplami=0;
    int basamaktakiSayi=0;
    int temp=sayi;


    String str = Integer.toString(sayi);


      for (int i = 0; i <str.length() ; i++) {
        basamaktakiSayi=sayi%10;
        sayiKuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
        sayi/=10;
      }
      if (temp==sayiKuplerToplami){
        System.out.println("Girilen sayi armstrong sayidir");
      }else {
        System.out.println("Girilen sayi armstrong sayi degildir");
      }


    } catch (InputMismatchException e) {
      System.out.println("harf girdiniz!!! sadece sayi girmelisiniz");
    }






  }
}
