package day4_practice;

public class Q04_ForLoop {
    public static void main(String[] args) {

    /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13       */

        int sayi1=100;
        int sayi2=13;
        int toplam=0;

        for (int i =sayi1; i >=sayi2 ; i--) {

            if (i%13==0) {
                System.out.println(i);
                toplam+=i;
            }

        }
        System.out.println("Toplam="+toplam);

    }
}
