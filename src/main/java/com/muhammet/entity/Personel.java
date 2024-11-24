package com.muhammet.entity;

import com.muhammet.utility.State;
import com.muhammet.utility.Vardiya;

import java.util.UUID;

public class Personel {
    private UUID uuid;
    private String ad;
    private String adres;
    private String userName;
    private String password;
    // vardiya
    private Vardiya vardiya;
    private State state;
    private Long createAt;
    private Long updateAt;

    public Personel() {
        this.uuid = UUID.randomUUID();
        this.state = State.ACTIVE;
        this.createAt = System.currentTimeMillis();
    }

    public Personel(String ad, String adres, String userName, String password, Vardiya vardiya) {
        this();
        this.ad = ad;
        this.adres = adres;
        this.userName = userName;
        this.password = password;
        this.vardiya = vardiya;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Personel{");
        sb.append("uuid=").append(uuid);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", vardiya=").append(vardiya);
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
