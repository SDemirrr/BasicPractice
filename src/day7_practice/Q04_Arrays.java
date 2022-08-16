package day7_practice;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {

        String str="verilen bir cumledeki bosluklar haric karakter sayisini bulunuz";
        str=str.replace(" ","");

        String[] harf=str.split("");
        System.out.println("karakter sayisi : "+harf.length);
    }

}
