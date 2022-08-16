package day1_2_practice;

public class Q12_IfStatement03 {
    public static void main(String[] args) {


    /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        String meslek = "qa";

        if (meslek.contains("qa")) {
            System.out.println("Quality Analyst");
        } else if (meslek.contains("dev")) {
            System.out.println("devoloper");

        } else if (meslek.contains("ba")) {
            System.out.println("Business analyst");

        } else if (meslek.contains("pm")) {
            System.out.println("Project Manager");

        }else System.out.println("Hatali giris");

    }
}
