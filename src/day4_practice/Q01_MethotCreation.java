package day4_practice;

public class Q01_MethotCreation {
    public static void main(String[] args) {
         /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

     birDefaYazdir("aabbcccccddddaaa");
    }

    private static void birDefaYazdir(String input) {
        String kova="";

        for (int i = 0; i <input.length() ; i++) {
            if (!kova.contains(input.substring(i,i+1))){
                kova+=input.substring(i,i+1);
            }
        }
        System.out.println(kova);
    }
}
