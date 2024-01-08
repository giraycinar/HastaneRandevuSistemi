package com.giray.repository;

import com.giray.entity.Brans;

public class BransRepository extends RepositoryManager<Brans,Long>{
    public BransRepository() {
        super(new Brans());
    }
}
