package day12_okulProjesi;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<String> ogrtmnList=new ArrayList<>();
    static List<String> ogrncList=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;


   public static void girisPaneli(){
       System.out.println("===================================="+ "\nÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ"+
       "\n===================================="+ "\n1- ÖĞRENCİ İŞLEMLERİ"+ "\n2- ÖĞRETMEN İŞLEMLERİ"+
      "\nQ- ÇIKIŞ");

       String secim=scan.next().toUpperCase();
       switch (secim){
           case "1":{
               kisiTuru="OGRENCI";
               break;

           }case "2":{
               kisiTuru="OGRETMEN";
               islemMenusu();
               break;

           }case "Q":{

               break;

           } default:{
               System.out.println("Hatali giris yaptiniz");
               girisPaneli();
               break;
           }
       }
   }

    private static void islemMenusu() {
        System.out.println("Sectiginiz kisi turu "+kisiTuru+" lutfen asagidaki islemleri seciniz");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("islem tercihinizi giriniz");
        int secilenIslem=scan.nextInt();

        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
              arama();
              islemMenusu();
                break;
            case 3:
               // listeleme();
                islemMenusu();
                break;
            case 4:
               // silme();
                islemMenusu();
                break;
            case 5:
             //   anaMenu();
                islemMenusu();
                break;
            case 0:
               // cikis();
                break;
            default:
                System.out.println("Guzel birsey gir");
                islemMenusu();
                break;
    }


}

    private static void arama() {
        System.out.println("***** "+kisiTuru+" arama turune hosgeldiniz");
        System.out.println("Aradiginiz "+kisiTuru+"'nin ismini ve soyismini giriniz");
        scan.nextLine();
        String arananIsimSoyisim;




        }

    private static void ekle() {
        System.out.println("***** "+kisiTuru+" ekleme turune hosgeldiniz");

        System.out.println("isim soyisim giriniz");
        String adSoyad=scan.nextLine();
        scan.nextLine();

        System.out.println("kimlik no giriniz");
        String kimlikNo=scan.nextLine().replaceAll(" ","" );

        System.out.println("Yas giriniz");
        int yas=scan.nextInt();

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("Ogrenci no giriniz");
            String num=scan.nextLine();
            scan.nextLine();
            System.out.println("Ogrenci sinif giriniz");
            String sinif=scan.nextLine();

            Ogrenci ogrenci=new Ogrenci();
            ogrncList.add(String.valueOf(ogrenci));
            System.out.println(ogrenci.getIsimSoyisim()+" listeye eklendi");

        }else {
            System.out.println("bolum giriniz");
            String bolum=scan.nextLine();
            scan.nextLine();
            System.out.println("Sicil no giriniz");
            String sicilNo=scan.nextLine();

            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogrtmnList.add(String.valueOf(ogretmen));

        }
    }
    }
