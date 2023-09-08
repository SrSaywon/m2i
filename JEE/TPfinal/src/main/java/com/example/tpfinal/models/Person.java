package com.example.tpfinal.models;

public class Person {

    private static Long count = 0L;
    private final Long id;
    private String firstname;
    private String lastname;
    private String job;

    public Person() {this.id = ++count;}

    public Person( String firstname, String lastname, String job) {
        this.id = ++count;
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = job;
    }

    public Long getId() {
        return id;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
