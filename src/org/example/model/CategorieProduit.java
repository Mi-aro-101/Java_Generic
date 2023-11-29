/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.model;

import org.miframework.annotation.Column;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */
@Table(name="categorie")
public class CategorieProduit {
    
    @Pk
    @Column(name="id_categorie")
    Integer id_categorie;
    
    @Column(name="nom_categorie")
    String nomCategorie;
    
    public CategorieProduit(){}

    public Integer getId_categorie() {
        return id_categorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setId_categorie(Integer id_categorie) {
        this.id_categorie = id_categorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
    
}
