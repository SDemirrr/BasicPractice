package day9_practice.restourant;

import java.awt.*;

public class musteri {
    public static void main(String[] args) {
        Mutfak menu = new Mutfak();
        System.out.println(menu.toString());

        Mutfak siparis=new Mutfak("Adana kebap","mercimek","kunefe","salgam");
        System.out.println(siparis);


    }
}
