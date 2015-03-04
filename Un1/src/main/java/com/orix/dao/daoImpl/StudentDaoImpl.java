package com.orix.dao.daoImpl;

import com.orix.dao.StudentDao;
import com.orix.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * Created by Inf1mum on 02.03.2015.
 */
@Repository
public class StudentDaoImpl extends GenericDaoImpl<Student,Integer> implements StudentDao {
    public StudentDaoImpl() {
        super(Student.class);
    }
}
