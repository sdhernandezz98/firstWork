/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstwork;

/**
 *
 * @author Sebastian H
 */
public class Student {
    
    private int studentID;
    private String gradeAverage;
    private int semester;
    private int scheduleID;
    private int subjectID;

    public Student(int studentID, String gradeAverage, int semester, int scheduleID, int subjectID) {
        this.studentID = studentID;
        this.gradeAverage = gradeAverage;
        this.semester = semester;
        this.scheduleID = scheduleID;
        this.subjectID = subjectID;
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
     * @return the gradeAverage
     */
    public String getGradeAverage() {
        return gradeAverage;
    }

    /**
     * @param gradeAverage the gradeAverage to set
     */
    public void setGradeAverage(String gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * @return the scheduleID
     */
    public int getScheduleID() {
        return scheduleID;
    }

    /**
     * @param scheduleID the scheduleID to set
     */
    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
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
    
    
    
}
