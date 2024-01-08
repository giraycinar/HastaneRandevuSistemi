package com.giray;

import com.giray.service.DoktorService;
import com.giray.service.HastaService;
import com.giray.utility.enums.CreateRepoImpl;

/**
 *  Hastane Randevu Sistemi
 *  --> 10+ Bran�
 *  --> 20+ Hasta
 *  --> 5+ Doktor
 *  --> 100+ Randevu
 *  -----------------------
 *  hastaservice
 *  ------ ad� verilen hastan�n randevular�
 *  ------ hangi bran�larda ka� randevu alm��
 *  ------ belli bir tarih aral���ndaki randevular�
 *  doktorservice
 *  ------ ad� verilen doktor ka� hasta bakm��
 *  ------ belli bir bran�ta g�rev yapan doktorlar kimlerdir.
 *
 *
 *  randevu --> doktor, hasta / doktor --> brans
 *  1. ad�m filter hastaId, kac farkl� randevu alm��.
 *  2. List<String> doktorId, not tekille�tirmemelisiniz.
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
