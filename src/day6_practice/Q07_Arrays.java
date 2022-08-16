package day6_practice;

public class Q07_Arrays {

    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */
    public static void main(String[] args) {
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        toplamEsitMi(arr,istenenToplam);


    }

    private static void toplamEsitMi(int[] arr, int istenenToplam) {
        int ilkIndex=arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length; j++) {
                if (istenenToplam== arr[i]+arr[j]){
                    System.out.println(arr[i]+"+"+arr[j]+"="+istenenToplam);

            }

        }

        }

    }


}
