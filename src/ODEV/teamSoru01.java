package ODEV;

import java.util.Arrays;

public class teamSoru01 {

    // Tamsayilardan olusan bir array de  en kucuk pozitif elemanı ve
    // en buyuk negatif elemanı bulun
    // Ornek: {-12,18,-5,23,-2} ==> En kucuk pozitif sayi= 18 , En buyuk negatif sayi=-2

    public static void main(String[] args) {

        int[] sayilar={-12,18,-5,23,-2};
       Arrays.sort(sayilar);

        int enKucukPozitifSayi=sayilar[sayilar.length-1];
        int enBuyukNegatifSayi=sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {
            if (enKucukPozitifSayi>sayilar[i]&&sayilar[i]>0){
                enKucukPozitifSayi=sayilar[i];
            }if (enBuyukNegatifSayi<sayilar[i]&&sayilar[i]<0){
                enBuyukNegatifSayi=sayilar[i];
            }
        }
        System.out.println("en buyuk negatif tamsayi="+enBuyukNegatifSayi+"\nen kucuk pozitif tamsayi="+enKucukPozitifSayi);


    }
}
