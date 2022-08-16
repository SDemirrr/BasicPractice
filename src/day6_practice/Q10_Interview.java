package day6_practice;

import java.util.Scanner;

public class Q10_Interview {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str=scan.nextLine();
        System.out.println("Lutfen bir sayi giriniz");
        int input=scan.nextInt();

        System.out.println(ilkSonHarf(str, input));


    }

    private static String ilkSonHarf(String str, int input) {
        String dondur="";
        String ilkVeSonaHarf=str.substring(0,1)+str.substring(str.length()-1);

        for (int i = 0; i <=input ; i++) {

            dondur+=ilkVeSonaHarf;

        }



   return ilkVeSonaHarf;

    }


}
