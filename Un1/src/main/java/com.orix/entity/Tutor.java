package com.orix.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Inf1mum on 28.02.2015.
 */
@Entity
@Table(name = "tutor")
@PrimaryKeyJoinColumn(name="id")
public class Tutor extends User {

    private List<Student> students;

    private List<Feedback> feedbacks;


    @ManyToMany
    @JoinTable(name = "student_tutor", catalog = "project", joinColumns = {
            @JoinColumn(name = "tutor_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "student_id",
                    nullable = false, updatable = false) })
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @OneToMany(mappedBy = "tutor")
    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Tutor(String login, String password, String firstName, String email, String lastName) {
        super(login, password, firstName, email, lastName);

    }

    public Tutor(){

    }
}
