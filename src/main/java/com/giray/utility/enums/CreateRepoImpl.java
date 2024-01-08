package com.giray.utility.enums;

import com.giray.entity.Brans;
import com.giray.entity.Doktor;
import com.giray.entity.Hasta;
import com.giray.entity.Randevu;
import com.giray.repository.BransRepository;
import com.giray.repository.DoktorRepository;
import com.giray.repository.HastaRepository;
import com.giray.repository.RandevuRepository;
import lombok.Data;

import java.sql.Date;

public class CreateRepoImpl {
    private final BransRepository bransRepository;
    private final DoktorRepository doktorRepository;
    private final RandevuRepository randevuRepository;
    private final HastaRepository hastaRepository;

    public CreateRepoImpl(){
        this.bransRepository = new BransRepository();
        this.doktorRepository = new DoktorRepository();
        this.hastaRepository = new HastaRepository();
        this.randevuRepository = new RandevuRepository();

    }

    public void createDemoData(){
        createHasta();
        createDoktor();
        createRandevu();
        createBrans();

    }
    public void createHasta(){
        hastaRepository.save(Hasta.builder()
                .ad("Ali")
                .adres("Ýstanbul")
                .yas(20)
                .telefon("0 555 444 6688")
                .doktorId(1L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Mali")
                .adres("Ýstanbul")
                .yas(25)
                .telefon("0 555 884 7688")
                .doktorId(1L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Veli")
                .adres("Edirne")
                .yas(32)
                .telefon("0 555 999 6688")
                .doktorId(2L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Dali")
                .adres("Ankara")
                .yas(50)
                .telefon("0 555 444 6699")
                .doktorId(3L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Mali")
                .adres("Iðdýr")
                .yas(65)
                .telefon("0 555 444 5575")
                .doktorId(4L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Gali")
                .adres("Konya")
                .yas(56)
                .telefon("0 555 333 6688")
                .doktorId(1L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Hali")
                .adres("Antalya")
                .yas(18)
                .telefon("0 555 444 6666")
                .doktorId(2L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Zali")
                .adres("Çanakkale")
                .yas(32)
                .telefon("0 555 444 4444")
                .doktorId(3L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Çali")
                .adres("Ýstanbul")
                .yas(21)
                .telefon("0 555 444 8888")
                .doktorId(3L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Lali")
                .adres("Ýznik")
                .yas(29)
                .telefon("0 555 444 8877")
                .doktorId(2L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Jali")
                .adres("Ýstanbul")
                .yas(28)
                .telefon("0 555 444 6648")
                .doktorId(1L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Sali")
                .adres("Kütahya")
                .yas(28)
                .telefon("0 555 774 6688")
                .doktorId(3L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Kali")
                .adres("Hatay")
                .yas(25)
                .telefon("0 555 444 2525")
                .doktorId(4L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Pali")
                .adres("Bursa")
                .yas(46)
                .telefon("0 555 444 4646")
                .doktorId(5L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Fali")
                .adres("Antalya")
                .yas(35)
                .telefon("0 555 444 3588")
                .doktorId(5L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Pali")
                .adres("Muðla")
                .yas(28)
                .telefon("0 555 444 6628")
                .doktorId(4L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Wali")
                .adres("Erzurum")
                .yas(56)
                .telefon("0 555 944 6688")
                .doktorId(2L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Nali")
                .adres("Kars")
                .yas(73)
                .telefon("0 555 444 7388")
                .doktorId(1L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Cali")
                .adres("Rize")
                .yas(52)
                .telefon("0 555 444 5252")
                .doktorId(3L)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Rali")
                .adres("Ýstanbul")
                .yas(81)
                .telefon("0 555 444 8188")
                .doktorId(3L)
                .build());


    }
    public void createDoktor(){
        doktorRepository.save(Doktor.builder()
                .ad("Kemal")
                .adres("Ýstanbul")
                .yas(32)
                .telefon("0 555 444 6688")
                .branslar(EBranslar.DERMATOLOJI)
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Lemal")
                .adres("Edirne")
                .yas(65)
                .telefon("0 555 666 9944")
                .branslar(EBranslar.GASTROENTEROLOJI)
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Nemal")
                .adres("Iðdýr")
                .yas(45)
                .telefon("0 444 666 8877")
                .branslar(EBranslar.ENDOKRINOLOJI)
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Þemal")
                .adres("Çanakkale")
                .yas(32)
                .telefon("0 555 444 9922")
                .branslar(EBranslar.NOROLOJI)
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Demal")
                .adres("Sivas")
                .yas(64)
                .telefon("0 555 666 9911")
                .branslar(EBranslar.KARDIYOLOJI)
                .build());

    }
    public void createRandevu(){
        randevuRepository.save(Randevu.builder()
                .id(1L)
                .randevuNumarasi(5)
                .randevuZamani(Date.valueOf(" 22 "))
                .hastaId(8L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(2L)
                .randevuNumarasi(4)
                .randevuZamani(Date.valueOf(" 23 "))
                .hastaId(3L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(3L)
                .randevuNumarasi(2)
                .randevuZamani(Date.valueOf(" 24 "))
                .hastaId(1L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(4L)
                .randevuNumarasi(1)
                .randevuZamani(Date.valueOf(" 25 "))
                .hastaId(2L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(6L)
                .randevuNumarasi(4)
                .randevuZamani(Date.valueOf(" 26 "))
                .hastaId(4L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(7L)
                .randevuNumarasi(12)
                .randevuZamani(Date.valueOf(" 27 "))
                .hastaId(8L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(8L)
                .randevuNumarasi(7)
                .randevuZamani(Date.valueOf(" 28 "))
                .hastaId(3L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(9L)
                .randevuNumarasi(8)
                .randevuZamani(Date.valueOf(" 29 "))
                .hastaId(1L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(10L)
                .randevuNumarasi(9)
                .randevuZamani(Date.valueOf(" 29 "))
                .hastaId(2L)
                .build());
        randevuRepository.save(Randevu.builder()
                .id(5L)
                .randevuNumarasi(4)
                .randevuZamani(Date.valueOf(" 30 "))
                .hastaId(4L)
                .build());
    }
    public  void createBrans(){
        bransRepository.save(Brans.builder()
                .id(1L)
                .bransAdi(EBranslar.GOZ_HASTALIKLARI)
                .doktorId(2L)
                .build());
        bransRepository.save(Brans.builder()
                .id(2L)
                .bransAdi(EBranslar.ENFEKSIYON_HASTALIKLARI)
                .doktorId(3L)
                .build());
        bransRepository.save(Brans.builder()
                .id(3L)
                .bransAdi(EBranslar.DERMATOLOJI)
                .doktorId(4L)
                .build());
        bransRepository.save(Brans.builder()
                .id(4L)
                .bransAdi(EBranslar.KARDIYOLOJI)
                .doktorId(5L)
                .build());
        bransRepository.save(Brans.builder()
                .id(5L)
                .bransAdi(EBranslar.KBB)
                .doktorId(6L)
                .build());

    }
}
