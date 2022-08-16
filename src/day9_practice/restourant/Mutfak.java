package day9_practice.restourant;

public class Mutfak {
    public String yemekler="Adana kebap,urfa ciger,kusbasi,kusleme";
    public String arasicak="yayla corba,mercimek corba,dugun corba";
    public String tatli="baklava,sutlac,gullac,kunefe,kazandibi";
    public String icecekler="ayran,salgam,kola";





    public Mutfak() {
        this("Adana kebap","mercimek","kenefe","kazandibi");

    }

    public Mutfak(String adana_kebap, String mercimek, String kunefe, String salgam) {
        this.yemekler=adana_kebap;
        this.arasicak=mercimek;
        this.tatli=kunefe;
        this.icecekler=salgam;
    }

    @Override
    public String toString() {
        return "menu"+
                "\nyemekler=" + yemekler +
                "\narasicak=" + arasicak +
                "\ntatli=" + tatli +
                "\nicecekler=" + icecekler ;
    }
}
