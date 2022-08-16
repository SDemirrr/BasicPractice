package day10_practice.constructor;

import java.util.Scanner;

public class ConstructorIsimDegistirme {

// class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin

     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni
     *  bilgileri
     * yazdirsin

     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin

     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
     *  "soyisim"
      variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
      istesin ve
      eski soyismi degistirsin.

     * Not :Instance variable'lar object'lere aittir ve diger adi object
     * variable'dir
     */





    public static void main(String[] args) {

        String isim="Selim";
        String soyIsim="Deniz";
        String ogrNo="12345";
        String bolum="TM";

        isimDegistir(isim,soyIsim,ogrNo,bolum);
        System.out.println("isim : "+isim+"\nsoyisim : "+soyIsim+"\nOgrenci numarasi : "+ogrNo+"\nBolum  : "+bolum);

        soyIsimDegistir(soyIsim);
      System.out.println("isim : "+isim+"\nOgrenci numarasi : "+ogrNo+"\nBolum  : "+bolum+"\n"+soyIsim);


    }

    private static void soyIsimDegistir(String soyIsim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni soyismi giriniz");
        soyIsim=scan.nextLine();
        System.out.println("Yeni soyism : "+soyIsim);



    }

    private static void isimDegistir(String isim, String soyIsim, String ogrNo, String bolum) {

        soyIsim="Demir";
        ogrNo="54321";
        bolum="Sozel";
        System.out.println("isim : "+isim+"\nsoyisim : "+soyIsim+"\nOgrenci numarasi : "+ogrNo+"\nBolum  : "+bolum);

    }


}
