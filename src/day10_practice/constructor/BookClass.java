package day10_practice.constructor;

public class BookClass {

   String adi, yazari;
    int yayinYili;

    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin


    public BookClass(String adi, String yazari, int yayinYili) {
            this("Genclik","Tolstoy");
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;

    }
    public BookClass(String adi, String yazari){
        this.adi = adi;
        this.yazari = yazari;
        System.out.println("iki paramatreli : "+adi+" "+yazari);

    }

    public BookClass() {

    }

    public static void main(String[] args) {
        BookClass obj1 = new BookClass("Cinali", "Selim", 1996);
        BookClass obj2 = new BookClass("Babalar ve ogullari", "Turgenyev");

        yazdir(obj1,obj2);


    }

    private static void yazdir(BookClass obj1, BookClass obj2) {

        System.out.println("Obj1 : "+obj1);
        System.out.println("Obj2\nAdi : "+obj2.adi+"\nYazari : "+obj2.yazari);

    }


    @Override
    public String toString() {
        return "\nadi : " + adi +
                "\nyazari : " + yazari +
                "\nyayinYili : " + yayinYili;
    }
}