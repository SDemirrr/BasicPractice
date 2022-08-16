package day3_practice;

public class Q02_StringManipMethodCreation {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        System.out.println(varMiYokMu());

    }

    public static boolean varMiYokMu() {
        String str="selimxyzaz";

        if (str.contains("xyz")) {
         return true;

        }else{
           return false;
        }




    }
}
