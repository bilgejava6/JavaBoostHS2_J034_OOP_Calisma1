package com.muhammet.repository;

import com.muhammet.entity.Urun;

import java.util.UUID;

public class UrunRepository implements Repository<Urun>{
    public void save(Urun entity) {

    }

    public void update(Urun entity) {

    }

    public void delete(Urun entity) {

    }

    public Urun[] findAll() {
        return new Urun[0];
    }

    public Urun findById(UUID uuid) {
        return null;
    }

    public boolean existsById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
