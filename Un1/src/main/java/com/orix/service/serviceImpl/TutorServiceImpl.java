package com.orix.service.serviceImpl;

import com.orix.dao.TutorDao;
import com.orix.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Inf1mum on 04.03.2015.
 */

@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    @Qualifier("tutorDao")
    private TutorDao tutorDao;
}
