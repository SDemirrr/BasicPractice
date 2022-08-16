package day13_interviewQuestios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */


        List<Integer> list = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();
        list.add(0);
        list.add(1);

        System.out.println("fibonacciList : "+list);

        int i=1;//while sartini olusturmak icin kullandik

        if (sayi<=1){
            System.out.println("daha buyuk sayilar gir");
        }else {
            while (list.get(i)<sayi){
                list.add(list.get(i)+list.get(i-1));
                i++;
            }

            list.remove(list.size()-1);

            System.out.println("fibnacci list : "+list);
        }

    }
}
