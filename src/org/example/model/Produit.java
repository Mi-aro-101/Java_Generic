/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.model;

import java.time.LocalDate;
import org.miframework.annotation.Column;
import org.miframework.annotation.Fk;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */
@Table(name="produit")
public class Produit {
    
    @Pk
    @Column(name="id_produit")
    Integer id;
    
    @Column(name="nom_produit")
    String nomProduit;
    
    @Fk(join = "id_categorie")
    CategorieProduit categorie;
    
    @Column(name="date_achat")
    LocalDate dateAchat;
    
    @Column(name="prix")
    double prix;
    
    public Produit(){}

    public Integer getId() {
        return id;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public CategorieProduit getCategorie() {
        return categorie;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setCategorie(CategorieProduit categorie) {
        this.categorie = categorie;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
