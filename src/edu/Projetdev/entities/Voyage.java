
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.Projetdev.entities;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author yassi
 */
public class Voyage 
{
private int id_voy;
private String nom_comp;
private String dt_dep;
private String dt_arv;

private Time hr_dep;
private Time hr_arv;

private String nom_arp_dep;
private String nom_arp_arv;

    public Voyage(int id_voy, String nom_comp, String dt_dep, String dt_arv, String nom_arp_dep, String nom_arp_arv) {
        this.id_voy = id_voy;
        this.nom_comp = nom_comp;
        this.dt_dep = dt_dep;
        this.dt_arv = dt_arv;
        /*
        this.hr_dep = hr_dep;
        this.hr_arv = hr_arv;
        */
        this.nom_arp_dep = nom_arp_dep;
        this.nom_arp_arv = nom_arp_arv;
    }



   


public Voyage()
{
    
}

    public int getId_voy() {
        return id_voy;
    }

    public String getNom_comp() {
        return nom_comp;
    }

    public String getDt_dep() {
        return dt_dep;
    }

    public String getDt_arv() {
        return dt_arv;
    }

/*    
public Time getHr_dep() {
        return hr_dep;
    }

    public Time getHr_arv() {
        return hr_arv;
    }

*/
    public String getNom_arp_dep() {
        return nom_arp_dep;
    }

    public String getNom_arp_arv() {
        return nom_arp_arv;
    }

    public void setId_voy(int id_voy) {
        this.id_voy = id_voy;
    }

    public void setNom_comp(String nom_comp) {
        this.nom_comp = nom_comp;
    }

    public void setDt_dep(String dt_dep) {
        this.dt_dep = dt_dep;
    }

    public void setDt_arv(String dt_arv) {
        this.dt_arv = dt_arv;
    }

/*    
public void setHr_dep(Time hr_dep) {
        this.hr_dep = hr_dep;
    }

    public void setHr_arv(Time hr_arv) {
        this.hr_arv = hr_arv;
    }

*/
    public void setNom_arp_dep(String nom_arp_dep) {
        this.nom_arp_dep = nom_arp_dep;
    }

    public void setNom_arp_arv(String nom_arp_arv) {
        this.nom_arp_arv = nom_arp_arv;
    }

    @Override
    public String toString() {
        return "Voyage{" + "id_voy=" + id_voy + ", nom_comp=" + nom_comp + ", dt_dep=" + dt_dep + ", dt_arv=" + dt_arv + ", nom_arp_dep=" + nom_arp_dep + ", nom_arp_arv=" + nom_arp_arv + '}';
    }

   
















}
