package com.orix.dao.daoImpl;

import com.orix.dao.FeedbackDao;
import com.orix.entity.Feedback;
import org.springframework.stereotype.Repository;

/**
 * Created by Inf1mum on 02.03.2015.
 */
@Repository
public class FeedbackDaoImpl extends GenericDaoImpl<Feedback,Integer> implements FeedbackDao {
    public FeedbackDaoImpl() {
        super(Feedback.class);
    }
}
