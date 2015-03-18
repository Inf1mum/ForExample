package com.orix.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Inf1mum on 28.02.2015.
 */

@Entity
@Table(name = "student")
@PrimaryKeyJoinColumn(name="id")
public class Student extends User {

    private List<Feedback> feedbacks;

    private List<Tutor> tutors;

    @OneToMany(mappedBy = "student")
    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    @ManyToMany(mappedBy = "students")
    public List<Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(List<Tutor> tutors) {
        this.tutors = tutors;
    }

    public Student(){

    }


}
