package recap2;

import java.util.Scanner;

public class Q06_StringManipulation {

    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu
        // iki kelimeyi String manipulation method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("iki string deger giriniz");
        String deger1=scan.next(),deger2=scan.next();

        System.out.println(deger1.substring(1).concat(deger2.substring(1)));
    }
}
