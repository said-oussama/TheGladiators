/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Projetdev.services;

import edu.Projetdev.entities.Voyage;
import edu.Projetdev.tools.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yassi
 */
public class VoyageCRUD 
{

    public void ajouterVoyage(Voyage v) 
    {
        try {
            String requette = "INSERT INTO voyage (nom_comp,dt_dep,dt_arv,nom_arp_dep,nom_arp_arv)"
                    +"VALUES(?,?,?,?,?)";
            PreparedStatement ps = MyConnection.getInstance().getCnx().prepareStatement(requette);
         
            ps.setString(1, v.getNom_comp());
            ps.setString(2, v.getDt_dep());
            ps.setString(3, v.getDt_arv());
            /*
            ps.setTime(4, v.getHr_dep());
            ps.setTime(5, v.getHr_arv());
            */
            ps.setString(4, v.getNom_arp_dep());
            ps.setString(5, v.getNom_arp_arv());
            ps.executeUpdate();
            System.out.println("voyage ajouté");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        
       }
    
    
    public void modifierVoyage(Voyage v, int id_voy) {
     try {
            String requette = ("update voyage set Nom_comp= ?,Dt_dep= ?,Dt_arv= ?,Nom_arp_dep= ?,Nom_arp_arv= ?  where id_voy= ? ");
            PreparedStatement ps = MyConnection.getInstance().getCnx().prepareStatement(requette);
            ps.setString(1, v.getNom_comp());
            ps.setString(2, v.getDt_dep());
            ps.setString(3, v.getDt_arv());
            /*
            ps.setTime(4, v.getHr_dep());
            ps.setTime(5, v.getHr_arv());
            */
            ps.setString(4, v.getNom_arp_dep());
            ps.setString(5, v.getNom_arp_arv());
            ps.setInt(6, id_voy);
            
            ps.executeUpdate();
            System.out.println("voyage modifié");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
   
    }
    
    
    
    
    public void supprimerVoyage(int id_voy) {
       try {
            
            String requette = ("delete from voyage where id_voy=?");
            PreparedStatement ps = MyConnection.getInstance().getCnx().prepareStatement(requette);
            ps.setInt(1,id_voy);
            ps.executeUpdate();
            System.out.println("voyage supprimé");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
    
    
    
    
    
    
    public List<Voyage>liste_voyages()
        {
            List<Voyage> liste_voyages= new ArrayList();
        try {
            String requette= "SELECT * FROM voyage";
            Statement st= MyConnection.getInstance().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requette);
            while(rs.next())
            {
                Voyage voy= new Voyage();
                voy.setId_voy(rs.getInt(1));
                voy.setNom_comp(rs.getString("nom_comp"));
                voy.setDt_dep(rs.getString("dt_dep"));
                voy.setDt_arv(rs.getString("dt_arv"));
               /*
                voy.setHr_dep(rs.getTime("heure_depart"));
                voy.setHr_arv(rs.getTime("heure_arrive"));
                */
                voy.setNom_arp_dep(rs.getString("nom_arp_dep"));
                voy.setNom_arp_arv(rs.getString("nom_arp_arv"));
                liste_voyages.add(voy);
                
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
        }
        return liste_voyages;
        
        }       





}
