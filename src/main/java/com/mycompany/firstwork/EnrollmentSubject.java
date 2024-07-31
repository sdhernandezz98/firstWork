/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstwork;

/**
 *
 * @author Sebastian H
 */
public class EnrollmentSubject {
    
    private int enrollmentID;
    private int studentID;
    private boolean status;

    public EnrollmentSubject(int enrollmentID, int studentID, boolean status) {
        this.enrollmentID = enrollmentID;
        this.studentID = studentID;
        this.status = status;
    }

    
    
    
    
    /**
     * @return the enrollmentID
     */
    public int getEnrollmentID() {
        return enrollmentID;
    }

    /**
     * @param enrollmentID the enrollmentID to set
     */
    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
