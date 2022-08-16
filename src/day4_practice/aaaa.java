package day4_practice;

public class aaaa {
    public static void main(String[] args) {
        /*
        Interview sorusu...
        Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
        (Büyük harf-küçük harf ayrımına dikkat ediniz)
        Test data:
        Input = AAABBCDD
        output = A3B2C1D2
                */
        
        String   input = " AAABBCDD";
        
        tekrarliHarfYazdir(input);
        
    }

    private static void tekrarliHarfYazdir(String input) {

        for (int i = 0; i <input.length()-1 ; i++) {

            if (input.substring(i).equals(input.substring(i+1))){
                System.out.print(input.substring(i,i+1)+""+i);
            }

        }


    }
}
