package ODEV;

public class soru02 {
    public static void main(String[] args) {
        /*
        dizide 7 rakamı  var ise  "Boom!" ifadesini; aksi takdirde
        "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
         Örnek çıktı:
           [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
          [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
           [2, 55, 60, 97, 86] ➞ "Boom!"
         */

        int arr[]={1, 2, 3, 4, 5, 6, 7};

       String count= boom(arr);
        System.out.println(count);



    }

    private static String boom(int[] arr) {
       String boom="";
       int onlarBasamak= 0;
       int birlerBasamak= 0;

        for (int i = 0; i < arr.length; i++) {
            birlerBasamak=arr[i]%10;
            onlarBasamak=arr[i]/10;
            if (arr[i]==7||birlerBasamak==7||onlarBasamak==7){
                boom="boom!";
                break;
            }else {
             boom="Dizide 7 rakami yok";
             break;
            }

        }


  return boom;
    }
}
