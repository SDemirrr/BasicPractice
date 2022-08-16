package day1_2_practice;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Adinizi giriniz");
        String isim=scanner.nextLine();

        System.out.println("Memleketinizi giriniz");
        String memleket=scanner.nextLine();

        System.out.println("konumunuzu girin");
        String konum=scanner.nextLine();

        System.out.println("yasinizi girin");
        int yas=scanner.nextInt();

        System.out.println("boyunuzu girin");
        double boy=scanner.nextDouble();

        System.out.println(konum+" seviyor musunuz");
        boolean severMi=scanner.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("severMi = " + severMi);


}}
