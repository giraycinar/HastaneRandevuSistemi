package com.giray.repository;

import com.giray.entity.Hasta;

public class HastaRepository extends RepositoryManager<Hasta,Long>{
    public HastaRepository() {
        super(new Hasta());
    }
}
