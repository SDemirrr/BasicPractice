package day10_practice.ogretman_Bilgileri;

import day10_practice.ogretman_Bilgileri.OgretmenBilgileri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class giris {

  static  Scanner scan=new Scanner(System.in);
 static  List<OgretmenBilgileri> ogretmenList=new ArrayList<>();


    public static void main(String[] args) {
      /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */

        System.out.println("*****HOSGELDINIZ OKULUMUZA*****");



        System.out.println("Isim giriniz");
        String isim=scan.nextLine();
        System.out.println("Soyisim giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("yas giriniz");
        int yas=scan.nextInt();
        System.out.println("brans giriniz");
        String brans=scan.next();
        scan.nextLine();
        System.out.println("telefon numarasi giriniz");
        String tel=scan.nextLine();

        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyIsim,yas,brans,tel);

       ogretmenList.add(adayOgretmen);
        System.out.println(ogretmenList);




    }
}


