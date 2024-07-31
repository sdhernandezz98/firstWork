/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstwork;

/**
 *
 * @author Sebastian H
 */
public class Registration {
    private int registrationID;
    private String status;
    private int creditsPaid;
    private int generatedDate;
    private int paidDay;

    public Registration(int registrationID, String status, int creditsPaid, int generatedDate, int paidDay) {
        this.registrationID = registrationID;
        this.status = status;
        this.creditsPaid = creditsPaid;
        this.generatedDate = generatedDate;
        this.paidDay = paidDay;
    }

    
    
    
    
    /**
     * @return the registrationID
     */
    public int getRegistrationID() {
        return registrationID;
    }

    /**
     * @param registrationID the registrationID to set
     */
    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the creditsPaid
     */
    public int getCreditsPaid() {
        return creditsPaid;
    }

    /**
     * @param creditsPaid the creditsPaid to set
     */
    public void setCreditsPaid(int creditsPaid) {
        this.creditsPaid = creditsPaid;
    }

    /**
     * @return the generatedDate
     */
    public int getGeneratedDate() {
        return generatedDate;
    }

    /**
     * @param generatedDate the generatedDate to set
     */
    public void setGeneratedDate(int generatedDate) {
        this.generatedDate = generatedDate;
    }

    /**
     * @return the paidDay
     */
    public int getPaidDay() {
        return paidDay;
    }

    /**
     * @param paidDay the paidDay to set
     */
    public void setPaidDay(int paidDay) {
        this.paidDay = paidDay;
    }
    
    
}
