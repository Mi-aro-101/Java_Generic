/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.model;

import org.miframework.annotation.Column;
import org.miframework.annotation.GenerationType;
import org.miframework.annotation.Pk;
import org.miframework.annotation.Table;

/**
 *
 * @author miaro
 */
@Table(name="personne")
public class Personne {
    
//    @Pk(generation = GenerationType.AUTO)AUTO
    @Pk(generation = GenerationType.MANUAL)
//    @Pk(generation = GenerationType.SEQ, sequence = "personne_seq")
    @Column(name="id")
    Integer id;
    
    @Column(name="nom")
    String nom;
        
    public Personne(){}

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}
