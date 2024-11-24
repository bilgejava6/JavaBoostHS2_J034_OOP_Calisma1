package com.muhammet.repository;

import com.muhammet.entity.Personel;

import java.util.UUID;

public class PersonelRepository implements Repository<Personel>{

    public void save(Personel entity) {

    }

    public void update(Personel entity) {

    }

    public void delete(Personel entity) {

    }

    public Personel[] findAll() {
        return new Personel[0];
    }

    public Personel findById(UUID uuid) {
        return null;
    }

    public boolean existsById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
