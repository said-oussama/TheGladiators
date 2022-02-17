/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Projetdev.services;

import edu.Projetdev.entities.Client;
import edu.Projetdev.tools.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassi
 */
public class ClientCRUD 
{
    
    public void ajouterClient(Client c) 
    {
        try {
            String requette = "INSERT INTO client (nom,prenom,mdp,pays)"
                    +"VALUES(?,?,?,?)";
            PreparedStatement ps = MyConnection.getInstance().getCnx().prepareStatement(requette);
         
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getMdp());
            ps.setString(4, c.getPays());
          
            ps.executeUpdate();
            System.out.println("client ajouté");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        
       }
    
    
    public List<Client>liste_clients()
        {
            List<Client> liste_clients= new ArrayList();
        try {
            String requette= "SELECT * FROM client";
            Statement st= MyConnection.getInstance().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requette);
            while(rs.next())
            {
                Client c= new Client();
                c.setIdc(rs.getInt(1));
                c.setNom(rs.getString("nom"));
                c.setPrenom(rs.getString("prenom"));
                c.setMdp(rs.getString("mdp"));
                c.setPays(rs.getString("pays"));
              
                liste_clients.add(c);
                
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
        }
        return liste_clients;
        
        }       
    
    
    
    
    
}
