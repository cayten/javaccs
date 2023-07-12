package day33_encapsulation;

public class Tasit {

    String tasitTuru;
    private boolean muyenesiVarMi;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }

    public boolean isMuyenesiVarMi() {
        return muyenesiVarMi;
    }

    public void setMuyenesiVarMi(boolean muyenesiVarMi) {
        this.muyenesiVarMi = muyenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    private int yil;
}
