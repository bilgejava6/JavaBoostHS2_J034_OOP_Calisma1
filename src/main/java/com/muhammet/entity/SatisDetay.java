package com.muhammet.entity;

public class SatisDetay {
    private Urun urun;
    private double fiyat;
    private int miktar;
    private int tutar;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SatisDetay{");
        sb.append("urun=").append(urun);
        sb.append(", fiyat=").append(fiyat);
        sb.append(", miktar=").append(miktar);
        sb.append(", tutar=").append(tutar);
        sb.append('}');
        return sb.toString();
    }

    public SatisDetay(Urun urun, double fiyat, int miktar, int tutar) {
        this.urun = urun;
        this.fiyat = fiyat;
        this.miktar = miktar;
        this.tutar = tutar;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }
}
