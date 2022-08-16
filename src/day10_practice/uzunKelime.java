package day10_practice;

import java.util.Scanner;

public class uzunKelime {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
     * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1 cumle giriniz");
        String cumle=scan.nextLine();

       String enUzun= enUzunKelime(cumle);
        System.out.println("en uzun kelime : "+enUzun);

        //ben bugun javayi daha cok sevdim ama cok zorlandim
    }

    public static String enUzunKelime(String cumle) {
        String[]arr=cumle.split(" ");
        String enUzun=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length()>enUzun.length()){
                enUzun=arr[i];
            }

        }

        return enUzun;
    }
}
