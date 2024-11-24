package com.muhammet.entity;

import com.muhammet.utility.State;

import java.util.UUID;

public class Musteri {
    private UUID uuid;
    private String ad;
    private String adres;
    private String tel;
    private String email;
    private String resim;
    private String not;
    private State state;
    private Long createAt;
    private Long updateAt;

    public Musteri() {
        this.uuid = UUID.randomUUID();
        this.createAt = System.currentTimeMillis();
        this.state = State.ACTIVE;
    }

    public Musteri(String ad, String adres, String tel, String email, String resim, String not) {
        this();
        this.ad = ad;
        this.adres = adres;
        this.tel = tel;
        this.email = email;
        this.resim = resim;
        this.not = not;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musteri{");
        sb.append("uuid=").append(uuid);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", tel='").append(tel).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", resim='").append(resim).append('\'');
        sb.append(", not='").append(not).append('\'');
        sb.append(", state=").append(state);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append('}');
        return sb.toString();
    }

    public UUID getUuid() {
        return uuid;
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
}
