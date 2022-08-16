package day3_practice;

import java.util.Scanner;

public class Q04_StringManipulation {

    public static void main(String[] args) {

        /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 1 kelime giriniz");
        String kelime=scanner.next();

        if (kelime.length()%2==1&&kelime.length()>=3){
            System.out.println(kelime.charAt((kelime.length())/2));
        }else {
            System.out.println("kelime tek sayida karakter veya 3 veya daha fazla karakter sayisina sahip degildir ");
        }




    }
}
