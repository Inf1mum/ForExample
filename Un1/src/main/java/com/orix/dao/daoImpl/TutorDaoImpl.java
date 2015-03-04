package com.orix.dao.daoImpl;

import com.orix.dao.TutorDao;
import com.orix.entity.Tutor;
import org.springframework.stereotype.Repository;

/**
 * Created by Inf1mum on 02.03.2015.
 */
@Repository
public class TutorDaoImpl extends GenericDaoImpl<Tutor,Integer> implements TutorDao {

    public TutorDaoImpl() {
        super(Tutor.class);
    }
}
