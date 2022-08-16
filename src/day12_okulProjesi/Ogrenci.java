package day12_okulProjesi;

public class Ogrenci extends Kisi {

  private   String ogrNo;
   private String sinif;


    public Ogrenci(String isimSoyisim, String kimlikNo, int yas,String ogrNo, String sinif) {
        super(isimSoyisim, kimlikNo, yas);
        this.ogrNo = ogrNo;
        this.sinif = sinif;
    }
    public  Ogrenci(){
        System.out.println("");

    }


    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci" +
                "\nogrNo=" + ogrNo+
                "\nsinif=" + sinif ;
    }
}
