package day1_2_practice;

public class Q02_Println_vs_Print {
    public static void main(String[] args) {
        /*
           println() ve print() arasinda tek fark var;
           println satir atliyor,
           print ise imlecin ayni satirda kalmasini sagliyor.

         */
        System.out.println("*****println*****");
        System.out.println("welcome");
        System.out.println("java");
        System.out.println("practice");
        System.out.println("*****print*****");
        System.out.print("welcome");
        System.out.print(" java");
        System.out.print(" practice");
    }
}
