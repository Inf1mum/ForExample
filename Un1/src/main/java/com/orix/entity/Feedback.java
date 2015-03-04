package com.orix.entity;


import javax.persistence.*;

/**
 * Created by Inf1mum on 28.02.2015.
 */
@Entity
@Table(name = "feedback")
public class Feedback {

    private int id;
    private String feedback;
    private Tutor tutor;
    private Student student;

    @Id
    @Column(name="id")
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="feedback")
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @ManyToOne
    @JoinColumn(name = "student_id")
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "tutor_id")
    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Feedback(String feedback) {
        this.feedback = feedback;
    }

    public Feedback() {
    }
}
