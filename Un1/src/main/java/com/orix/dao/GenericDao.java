package com.orix.dao;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Inf1mum on 02.03.2015.
 */


public interface GenericDao<E, PK extends Serializable> {

    void update(E obj);
    PK save(E obj);
    void delete(E obj);
    E load(PK index);
    E get(PK index);

}
