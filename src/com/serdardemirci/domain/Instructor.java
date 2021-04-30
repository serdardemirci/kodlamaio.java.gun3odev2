package com.serdardemirci.domain;

public class Instructor extends User{

    private int instructorNumber;

    public Instructor(int id, String firstName, String lastName, int instructorNumber) {
        super(id, firstName, lastName);
        setInstructorNumber(instructorNumber);
    }

    public int getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(int instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
}
