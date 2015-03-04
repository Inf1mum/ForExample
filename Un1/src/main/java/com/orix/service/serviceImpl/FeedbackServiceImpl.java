package com.orix.service.serviceImpl;

import com.orix.dao.FeedbackDao;
import com.orix.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Inf1mum on 04.03.2015.
 */

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    @Qualifier("feedbackDao")
    private FeedbackDao feedbackDao;
}
