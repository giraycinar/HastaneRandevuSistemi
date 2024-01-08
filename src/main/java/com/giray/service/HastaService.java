package com.giray.service;

import com.giray.entity.Hasta;
import com.giray.entity.Randevu;
import com.giray.repository.BransRepository;
import com.giray.repository.DoktorRepository;
import com.giray.repository.HastaRepository;
import com.giray.repository.RandevuRepository;
import java.util.List;
import java.util.Optional;

public class HastaService {
    private final BransRepository bransRepository;
    private final DoktorRepository doktorRepository;
    private  final HastaRepository hastaRepository;
    private  final RandevuRepository randevuRepository;

    public HastaService(){
        this.bransRepository = new BransRepository();
        this.hastaRepository = new HastaRepository();
        this.doktorRepository = new DoktorRepository();
        this.randevuRepository = new RandevuRepository();
    }
    public void getRandevuOnHastaId(Long hastaId){
        Optional<Hasta> hasta = hastaRepository.findById(hastaId);
        hasta.ifPresent(k-> {
            System.out.println("***** HASTA BÝLGÝSÝ *****");
            System.out.println(k);
            System.out.println();
            List<Randevu> randevuListesi = randevuRepository.findByColumnAndValue("hastaId", k.getId());


        });

    }




}
