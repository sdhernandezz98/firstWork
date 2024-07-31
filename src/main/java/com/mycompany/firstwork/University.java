/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstwork;

/**
 *
 * @author Sebastian H
 */
public class University {
    
    private String name;
    private String address;
    private String undergraduate;
    private String postgraduate;

    public University(String name, String address, String undergraduate, String postgraduate) {
        this.name = name;
        this.address = address;
        this.undergraduate = undergraduate;
        this.postgraduate = postgraduate;
    }

    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the undergraduate
     */
    public String getUndergraduate() {
        return undergraduate;
    }

    /**
     * @param undergraduate the undergraduate to set
     */
    public void setUndergraduate(String undergraduate) {
        this.undergraduate = undergraduate;
    }

    /**
     * @return the postgraduate
     */
    public String getPostgraduate() {
        return postgraduate;
    }

    /**
     * @param postgraduate the postgraduate to set
     */
    public void setPostgraduate(String postgraduate) {
        this.postgraduate = postgraduate;
    }
    
    
    
}
