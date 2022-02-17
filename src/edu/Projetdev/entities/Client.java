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
public class Client 
{
 private int idc;  
 private String nom;
 private String prenom;
 private String mdp;
 private String pays;

public Client()
{

}

    public Client(int idc, String nom, String prenom, String mdp, String pays) 
    {
        this.idc = idc;
        this.nom = nom;
        this.prenom = prenom;
        this.mdp = mdp;
        this.pays = pays;
    }

    public int getIdc() {
        return idc;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMdp() {
        return mdp;
    }

    public String getPays() {
        return pays;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Client{" + "idc=" + idc + ", nom=" + nom + ", prenom=" + prenom + ", mdp=" + mdp + ", pays=" + pays + '}';
    }
    
    



   










 
}


