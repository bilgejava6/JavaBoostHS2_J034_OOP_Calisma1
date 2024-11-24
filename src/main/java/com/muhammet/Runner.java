package com.muhammet;

import com.muhammet.entity.Musteri;
import com.muhammet.entity.Personel;
import com.muhammet.repository.MusteriRepository;
import com.muhammet.repository.PersonelRepository;

public class Runner {
    public static void main(String[] args) {
        Musteri musteri = new Musteri("muhammet","ankara","0 555 888 7777",
                "muhammet@gmail.com","https://picsum.photos/100/100",
                "sürekli borçlarını öteleyen birisi, ürün verirken dikkatli olalım.");
        MusteriRepository musteriRepository = new MusteriRepository();
        musteriRepository.save(musteri);

        Personel personel =  new Personel();
        PersonelRepository personelRepository = new PersonelRepository();
        personelRepository.save(personel);
    }
}