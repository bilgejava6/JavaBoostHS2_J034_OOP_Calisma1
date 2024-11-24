package com.muhammet.repository;

import com.muhammet.entity.Satis;

import java.util.UUID;

public class SatisRepository implements Repository<Satis>{
    public void save(Satis entity) {

    }

    public void update(Satis entity) {

    }

    public void delete(Satis entity) {

    }

    public Satis[] findAll() {
        return new Satis[0];
    }

    public Satis findById(UUID uuid) {
        return null;
    }

    public boolean existsById(UUID uuid) {
        return false;
    }

    public int count() {
        return 0;
    }
}
