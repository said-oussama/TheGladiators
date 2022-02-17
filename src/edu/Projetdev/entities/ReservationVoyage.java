/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Projetdev.entities;

/**
 *
 * @author yassi
 */
public class ReservationVoyage 
{
    
    private int id_res_voy;
    private int id_voy;
    private int idc;
    
    
    public ReservationVoyage()
    {
        
    }

    public ReservationVoyage(int id_res_voy, int id_voy, int idc) {
        this.id_res_voy = id_res_voy;
        this.id_voy = id_voy;
        this.idc = idc;
    }

    public int getId_res_voy() {
        return id_res_voy;
    }

    public int getId_voy() {
        return id_voy;
    }

    public int getIdc() {
        return idc;
    }

    public void setId_res_voy(int id_res_voy) {
        this.id_res_voy = id_res_voy;
    }

    public void setId_voy(int id_voy) {
        this.id_voy = id_voy;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    @Override
    public String toString() {
        return "ReservationVoyage{" + "id_res_voy=" + id_res_voy + ", id_voy=" + id_voy + ", idc=" + idc + '}';
    }

    

   
    
    
    
    
    
    
}
