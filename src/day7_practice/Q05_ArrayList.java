package day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */
    public static void main(String[] args) {
        List<String> databaseIsimler=new ArrayList<String>();
        databaseIsimler.add("enes");
        databaseIsimler.add("ismail");
        databaseIsimler.add("abdul");
        databaseIsimler.add("emre");
        databaseIsimler.add("melisa");
        databaseIsimler.add("oguz");

        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanmak istediginiz username giriniz");
        String username=scan.nextLine().trim();

        boolean usernameVarMi=databaseIsimler.contains(username);

        if (usernameVarMi){
            System.out.println("Bu kullanici adi zaten alinmis");
        }else {
            System.out.println("Bu kullanici adini kullanabilirsiniz");
        }
        if (usernameVarMi) {
            int randomSayi=new Random().nextInt();
            username+=randomSayi;
            System.out.println("Yeni kullanici adiniz : "+username);

        }else {
            System.out.println("yeni kullanici adiniz : "+username);
        }


    }


}
