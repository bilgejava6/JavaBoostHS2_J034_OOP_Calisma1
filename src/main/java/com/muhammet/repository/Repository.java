package com.muhammet.repository;

import java.util.UUID;

/**
 * Generic Type
 * AhmetAmca -> Musteri, Personel, Satis, Urun
 * --------------
 * T - Type
 */
public interface Repository<T> {
    /**
     * class Calisan{
     * double maasKatsayisi;
     * public (double katsayi){
     *     this.maasKatsayisi = katsayi;
     * }
     * double memurMaasi(){
     *     return maasKatsayisi * 10 * 2500;
     * }
     * double muhendisMaasi(){
     *     return maasKatsayisi * 22 * 2500;
     * }
     * double mudurMaasi(){
     *     return maasKatsayisi * 29 * 2500;
     * }
     *
     */
    void save(T entity);
    void update(T entity);
    void delete(T entity);
    T[] findAll();
    T findById(UUID uuid);
    boolean existsById(UUID uuid);
    int count();
}
