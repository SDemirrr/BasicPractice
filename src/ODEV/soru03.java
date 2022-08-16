package ODEV;

public class soru03 {
    public static void main(String[] args) {

    /*
                    1. İki String ifadeyi parametre olarak alan bir metot tanımlayınız.
                    2. Metodumuz bir cümle ve bu cümleden çıkarmak istediğimiz kelimeyi  parametre olarak alsın.
                    3. Sonuç olarak metodumuz cümle içinden istediğimiz kelimeyi çıkararak bize döndürsün.
             Örneğin;
            ("bugün hava çok güzel", "çok") ➞ "Bugün hava güzel"
                ("merhaba dünya", "dünya") ➞ "merhaba"


     */
        String kelime="bugun hava cok guzel";
        String cikacakKelime="cok";

       String yenikelime= kelimeCikar(kelime,cikacakKelime);
        System.out.println(yenikelime);
}

    private static String kelimeCikar(String kelime, String cikacakKelime) {
        String yeniKelime="";
        String [] arr=kelime.split(" ");

        for (int i = 0; i < arr.length ; i++) {
            if (!arr[i].equals(cikacakKelime)){
                yeniKelime+=arr[i]+" ";
            }

        }

        return yeniKelime;
    }
}
