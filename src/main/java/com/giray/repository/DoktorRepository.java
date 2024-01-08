package com.giray.repository;

import com.giray.entity.Doktor;

public class DoktorRepository extends RepositoryManager<Doktor,Long>{
    public DoktorRepository() {
        super(new Doktor());
    }
}
