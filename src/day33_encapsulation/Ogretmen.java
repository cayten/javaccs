package day33_encapsulation;

public class Ogretmen {

    /* Bazen de yetkileri sinirlamak degil de
    yapilan isi daha iyi tanimlama icin encapsulation
    kullanilir
    Bu yaklamisi kullanan class larda tum variable lar private yapilip
    heosi icin getter ve setter olusturulur
     */

    private String isim;
   private String soyisim;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    private String brans;


}
