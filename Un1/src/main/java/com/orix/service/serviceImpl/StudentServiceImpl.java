package com.orix.service.serviceImpl;

import com.orix.dao.StudentDao;
import com.orix.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Inf1mum on 04.03.2015.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier("studentDao")
    private StudentDao studentDao;
}
