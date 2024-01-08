package com.giray.repository;

import com.giray.entity.Randevu;

public class RandevuRepository extends RepositoryManager<Randevu,Long>{
    public RandevuRepository() {
        super(new Randevu());
    }
}
