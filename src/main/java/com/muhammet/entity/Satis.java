package com.muhammet.entity;

import com.muhammet.utility.OdemeTuru;
import java.util.Arrays;

public class Satis extends BaseEntity{

    private Musteri musteri;
    private Personel personel;
    private Long satisTarihi;
    private SatisDetay[] urunler;
    private double toplamTutar;
    private OdemeTuru odemeTuru;


    public Satis() {

    }

    public Satis(Musteri musteri, Personel personel, Long satisTarihi, SatisDetay[] urunler, double toplamTutar, OdemeTuru odemeTuru) {

        this.musteri = musteri;
        this.personel = personel;
        this.satisTarihi = satisTarihi;
        this.urunler = urunler;
        this.toplamTutar = toplamTutar;
        this.odemeTuru = odemeTuru;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Satis{");
        sb.append("uuid=").append(getUuid());
        sb.append(", musteri=").append(musteri);
        sb.append(", personel=").append(personel);
        sb.append(", satisTarihi=").append(satisTarihi);
        sb.append(", urunler=").append(urunler == null ? "null" : Arrays.asList(urunler).toString());
        sb.append(", toplamTutar=").append(toplamTutar);
        sb.append(", odemeTuru=").append(odemeTuru);
        sb.append(", state=").append(getState());
        sb.append(", createAt=").append(getCreatedAt());
        sb.append(", updateAt=").append(getUpdatedAt());
        sb.append('}');
        return sb.toString();
    }



    public OdemeTuru getOdemeTuru() {
        return odemeTuru;
    }

    public void setOdemeTuru(OdemeTuru odemeTuru) {
        this.odemeTuru = odemeTuru;
    }

    public double getToplamTutar() {
        return toplamTutar;
    }

    public void setToplamTutar(double toplamTutar) {
        this.toplamTutar = toplamTutar;
    }

    public SatisDetay[] getUrunler() {
        return urunler;
    }

    public void setUrunler(SatisDetay[] urunler) {
        this.urunler = urunler;
    }

    public Long getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(Long satisTarihi) {
        this.satisTarihi = satisTarihi;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }
}
