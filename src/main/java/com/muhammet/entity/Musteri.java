package com.muhammet.entity;


public class Musteri extends BaseEntity{

    private String ad;
    private String adres;
    private String tel;
    private String email;
    private String resim;
    private String not;


    public Musteri() {
    }

    public Musteri(String ad, String adres, String tel, String email, String resim, String not) {
        this.ad = ad;
        this.adres = adres;
        this.tel = tel;
        this.email = email;
        this.resim = resim;
        this.not = not;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Musteri{");
        sb.append("ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", tel='").append(tel).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", resim='").append(resim).append('\'');
        sb.append(", not='").append(not).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;
    }

}
