package com.muhammet.entity;
import com.muhammet.utility.Vardiya;

public class Personel extends BaseEntity{

    private String ad;
    private String adres;
    private String userName;
    private String password;
    private Vardiya vardiya;


    public Personel() {

    }

    public Personel(String ad, String adres, String userName, String password, Vardiya vardiya) {

        this.ad = ad;
        this.adres = adres;
        this.userName = userName;
        this.password = password;
        this.vardiya = vardiya;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Personel{");
        sb.append("uuid=").append(getUuid());
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", vardiya=").append(vardiya);
        sb.append(", state=").append(getState());
        sb.append(", createAt=").append(getCreatedAt());
        sb.append(", updateAt=").append(getUpdatedAt());
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Vardiya getVardiya() {
        return vardiya;
    }

    public void setVardiya(Vardiya vardiya) {
        this.vardiya = vardiya;
    }


}
