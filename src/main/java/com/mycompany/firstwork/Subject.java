/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstwork;

/**
 *
 * @author Sebastian H
 */
public class Subject {
    
    private int subjectID;
    private String nameSubject;
    private int credits;
    private int zoneTime;
    private String scheduleOne;
    private String scheduleTwo;
    private int code;
    private int enrolledCount;
    private String location;
    private int enrollmenntID;

    public Subject(int subjectID, String nameSubject, int credits, int zoneTime, String scheduleOne, String scheduleTwo, int code, int enrolledCount, String location, int enrollmenntID) {
        this.subjectID = subjectID;
        this.nameSubject = nameSubject;
        this.credits = credits;
        this.zoneTime = zoneTime;
        this.scheduleOne = scheduleOne;
        this.scheduleTwo = scheduleTwo;
        this.code = code;
        this.enrolledCount = enrolledCount;
        this.location = location;
        this.enrollmenntID = enrollmenntID;
    }

    
    
    
    
    /**
     * @return the subjectID
     */
    public int getSubjectID() {
        return subjectID;
    }

    /**
     * @param subjectID the subjectID to set
     */
    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    /**
     * @return the nameSubject
     */
    public String getNameSubject() {
        return nameSubject;
    }

    /**
     * @param nameSubject the nameSubject to set
     */
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    /**
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * @return the zoneTime
     */
    public int getZoneTime() {
        return zoneTime;
    }

    /**
     * @param zoneTime the zoneTime to set
     */
    public void setZoneTime(int zoneTime) {
        this.zoneTime = zoneTime;
    }

    /**
     * @return the scheduleOne
     */
    public String getScheduleOne() {
        return scheduleOne;
    }

    /**
     * @param scheduleOne the scheduleOne to set
     */
    public void setScheduleOne(String scheduleOne) {
        this.scheduleOne = scheduleOne;
    }

    /**
     * @return the scheduleTwo
     */
    public String getScheduleTwo() {
        return scheduleTwo;
    }

    /**
     * @param scheduleTwo the scheduleTwo to set
     */
    public void setScheduleTwo(String scheduleTwo) {
        this.scheduleTwo = scheduleTwo;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the enrolledCount
     */
    public int getEnrolledCount() {
        return enrolledCount;
    }

    /**
     * @param enrolledCount the enrolledCount to set
     */
    public void setEnrolledCount(int enrolledCount) {
        this.enrolledCount = enrolledCount;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the enrollmenntID
     */
    public int getEnrollmenntID() {
        return enrollmenntID;
    }

    /**
     * @param enrollmenntID the enrollmenntID to set
     */
    public void setEnrollmenntID(int enrollmenntID) {
        this.enrollmenntID = enrollmenntID;
    }
    
    
    
}
