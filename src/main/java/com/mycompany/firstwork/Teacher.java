/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstwork;

/**
 *
 * @author Sebastian H
 */
public class Teacher {
    
    private int teacherID;
    private String currentlyTeaching;

    public Teacher(int teacherID, String currentlyTeaching) {
        this.teacherID = teacherID;
        this.currentlyTeaching = currentlyTeaching;
    }

    
    
    
    
    /**
     * @return the teacherID
     */
    public int getTeacherID() {
        return teacherID;
    }

    /**
     * @param teacherID the teacherID to set
     */
    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    /**
     * @return the currentlyTeaching
     */
    public String getCurrentlyTeaching() {
        return currentlyTeaching;
    }

    /**
     * @param currentlyTeaching the currentlyTeaching to set
     */
    public void setCurrentlyTeaching(String currentlyTeaching) {
        this.currentlyTeaching = currentlyTeaching;
    }
    
    
    
}
