package ODEV;


public class teamSoru02 {
    public static void main(String[] args) {

        /*
Bir String array de uzunlugu en kucuk olan elemani bulun
Ornek = {"Kemal","Jonathan","Mark", "Argie","Veli"}
Cıktı : Mark, Veli
 */

        String[] arr= {"Kemal","Jonathan","Mark", "Argie","Veli"};
        String kova="";
        int ilkKarakterUzunluk=arr[0].length();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length()<ilkKarakterUzunluk){
                ilkKarakterUzunluk=arr[i].length();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            if (ilkKarakterUzunluk==arr[i].length()){
                kova+=arr[i]+" ";
            }

        }
        System.out.println(kova);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length() ; j++) {
                if (arr[j].length()<ilkKarakterUzunluk){
                    kova+=arr[j]+" ";
                }

            }

        }
        System.out.println(kova);


    }

}
