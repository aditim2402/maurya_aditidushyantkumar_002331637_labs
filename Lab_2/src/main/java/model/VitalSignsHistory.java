/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */
public class VitalSignsHistory {
 ArrayList<vitalSigns> history;
 
 public VitalSignsHistory(){
     history= new ArrayList<vitalSigns>();
     
 }
    public vitalSigns addNewVitals(){
       vitalSigns newVs = new vitalSigns();
       history.add(newVs);
       return newVs;
       
    }
    public void removevitalSigns(vitalSigns vs){
        history.remove(vs);
        history.remove(vs);
    }
    public ArrayList<vitalSigns>getHistory(){
        return history;
    }

    public void removeVitals(vitalSigns selectedVitals) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
