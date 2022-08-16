package ODEV;

import java.util.Scanner;

public class soru01 {
    public static void main(String[] args) {
        //Arkadaşlar bir önceki soru çözümleriniz için teşekkür ederiz. Sizlerle yeni bir soru paylaşıyorum.
        // Kullanıcının girdiği integer sayıyı tersten yazdıran kod bloğu yazınız.
        // 123==>321 yada 1045==>5401


        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scan.nextInt();

       String sayiTers=String.valueOf(sayi);
       String temp="";

        for (int i = sayiTers.length()-1; i >=0 ; i--) {
           temp+= sayiTers.charAt(i);
        }
        System.out.println(sayi+"==>"+temp);
    }
}
