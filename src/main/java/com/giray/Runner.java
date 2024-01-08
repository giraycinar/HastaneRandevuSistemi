package com.giray;

import com.giray.service.DoktorService;
import com.giray.service.HastaService;
import com.giray.utility.enums.CreateRepoImpl;

/**
 *  Hastane Randevu Sistemi
 *  --> 10+ Branþ
 *  --> 20+ Hasta
 *  --> 5+ Doktor
 *  --> 100+ Randevu
 *  -----------------------
 *  hastaservice
 *  ------ adý verilen hastanýn randevularý
 *  ------ hangi branþlarda kaç randevu almýþ
 *  ------ belli bir tarih aralýðýndaki randevularý
 *  doktorservice
 *  ------ adý verilen doktor kaç hasta bakmýþ
 *  ------ belli bir branþta görev yapan doktorlar kimlerdir.
 *
 *
 *  randevu --> doktor, hasta / doktor --> brans
 *  1. adým filter hastaId, kac farklý randevu almýþ.
 *  2. List<String> doktorId, not tekilleþtirmemelisiniz.
 *  3. doktor tablosunda List<Doktor>, groupBy --> bransId
 */
public class Runner {
    public static void main(String[] args)
    {
        //new CreateRepoImpl().createDemoData();
        HastaService hastaService = new HastaService();
        //DoktorService doktorService = new DoktorService();

        hastaService.getRandevuOnHastaId(1L);

//        doktorService.getHastaOnDoktorId(2L);

//        doktorService.getHastaSayisiOnDoktorId(2L);

          


    }



}
