package com.muhammet.entity;

import com.muhammet.utility.Kampanya;
import com.muhammet.utility.StokTuru;
import com.muhammet.utility.UrunState;


public class Urun extends BaseEntity{

    private String ad;
    private String marka;
    private String model;
    private String kategori;
    private String aciklama;
    private double fiyat;
    private int kdv;
    private int stokAdedi;
    private UrunState urunState;
    private StokTuru stokTuru;
    private Kampanya kampanya;

    public Urun() {

    }

    public Urun(String ad, String marka, String model, String kategori, String aciklama, double fiyat, int kdv, int stokAdedi, UrunState urunState, StokTuru stokTuru, Kampanya kampanya) {

        this.ad = ad;
        this.marka = marka;
        this.model = model;
        this.kategori = kategori;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
        this.kdv = kdv;
        this.stokAdedi = stokAdedi;
        this.urunState = urunState;
        this.stokTuru = stokTuru;
        this.kampanya = kampanya;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Urun{");
        sb.append("id='").append(getUuid()).append('\'');
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", marka='").append(marka).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", kategori='").append(kategori).append('\'');
        sb.append(", aciklama='").append(aciklama).append('\'');
        sb.append(", fiyat=").append(fiyat);
        sb.append(", kdv=").append(kdv);
        sb.append(", stokAdedi=").append(stokAdedi);
        sb.append(", urunState=").append(urunState);
        sb.append(", stokTuru=").append(stokTuru);
        sb.append(", kampanya=").append(kampanya);
        sb.append('}');
        return sb.toString();
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(int stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public UrunState getUrunState() {
        return urunState;
    }

    public void setUrunState(UrunState urunState) {
        this.urunState = urunState;
    }

    public StokTuru getStokTuru() {
        return stokTuru;
    }

    public void setStokTuru(StokTuru stokTuru) {
        this.stokTuru = stokTuru;
    }

    public Kampanya getKampanya() {
        return kampanya;
    }

    public void setKampanya(Kampanya kampanya) {
        this.kampanya = kampanya;
    }
}
