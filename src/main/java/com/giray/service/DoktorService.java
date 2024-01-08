package com.giray.service;

import com.giray.entity.Doktor;
import com.giray.entity.Hasta;
import com.giray.entity.Randevu;
import com.giray.repository.BransRepository;
import com.giray.repository.DoktorRepository;
import com.giray.repository.HastaRepository;
import com.giray.repository.RandevuRepository;

import java.util.List;
import java.util.Optional;

public class DoktorService {

        private final BransRepository bransRepository;
        private final DoktorRepository doktorRepository;
        private  final HastaRepository hastaRepository;
        private  final RandevuRepository randevuRepository;

        public DoktorService(){
            this.bransRepository = new BransRepository();
            this.hastaRepository = new HastaRepository();
            this.doktorRepository = new DoktorRepository();
            this.randevuRepository = new RandevuRepository();
        }


    public void getHastaOnDoktorId(Long doktorId){
        Optional<Doktor> doktor = doktorRepository.findById(doktorId);
        doktor.ifPresent(k-> {
            System.out.println("***** DOKTOR BÝLGÝSÝ *****");
            System.out.println(k);
            System.out.println();
            List<Hasta> hastaListesi = hastaRepository.findByColumnAndValue("doktorId", k.getId());

        });

    }

    public void getHastaSayisiOnDoktorId(Long doktorId){
            Optional<Doktor> doktor = doktorRepository.findById(doktorId);
            doktor.ifPresent(k-> {
                System.out.println("***** HASTA SAYISI *****");
                System.out.println(k);
                System.out.println();
                hastaRepository.findAll().stream().count();
            });
    }



}
