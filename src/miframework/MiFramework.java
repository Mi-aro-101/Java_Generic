/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miframework;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import org.example.model.CategorieProduit;
import org.example.model.Personne;
import org.example.model.Produit;
import org.miframework.generic.GenericDac;
import org.miframework.generic.GenericDao;

/**
 *
 * @author miaro
 */
public class MiFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Test for the Connection generix
//        try {
//            String[] datas = GenericDac.getDatasFromFile();
//            for(String s : datas){
//                System.out.println(s);
//            }
            
//            HashMap<String, String> props = GenericDac.extract(datas);
//            for(String key : props.keySet()){
//                System.out.println(props.get(key));
//            }
            
             
//            System.out.println(GenericDac.generate());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        
        // Test for a model
//        Personne personne = new Personne();
//        System.out.println(personne.getClass().getSimpleName());

        // Dao test for get all (normal mode)
//        try {
//            List<Personne> all = GenericDao.getAll(Personne.class);
//            for(Personne personne : all){
//                System.out.println(personne.getId()+" : "+personne.getNom());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Dao test for insert as Pk = generationType = AUTO
//        Personne personne = new Personne();
//        personne.setId(null);
//        personne.setNom("Luc");
//        
//        GenericDao.insert(personne);
        
        // Dao test for insert as Pk = generationType = MANUAL
//        Personne personne = new Personne();
//        personne.setId(3);
//        personne.setNom("Luc");
//        
//        GenericDao.insert(personne);

        // Dao test for insert as Pk = generationType = SEQ
//         Personne personne = new Personne();
//        personne.setId(null);
//        personne.setNom("Luc");
//        
//        GenericDao.insert(personne);

        // Dao test for findById
//        try {
//            Personne personne = GenericDao.findById(Personne.class, 1);
//            System.out.println(personne.getId()+" : "+personne.getNom());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Dao test for  remove
//        Personne personne = new Personne();
//        personne.setId(3);
//        personne.setNom("Luc");
//        
//        GenericDao.remove(personne);

        //Dao test for update
//        Personne personne = new Personne();
//        personne.setId(3);
//        personne.setNom("Markos");
//        
//        GenericDao.update(personne);

        //  Daao test getAll for a ManyToOne mode
//        try {
//            List<Produit> produits = GenericDao.getAll(Produit.class);
//            for(Produit produit : produits){
//                System.out.println(produit.getId()+" : "+produit.getNomProduit()+" : "+produit.getDateAchat() );
//                System.out.println(produit.getCategorie().getId_categorie()+" : "+produit.getCategorie().getNomCategorie());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Dao test findById(id) for a ManyToOne context
//        try {
//            Produit produit = GenericDao.findById(Produit.class, 1);
//            System.out.println(produit.getId()+" : "+produit.getNomProduit()+" : "+produit.getDateAchat() );
//            System.out.println(produit.getCategorie().getId_categorie()+" : "+produit.getCategorie().getNomCategorie());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Dao test update with ManyToOne
//        CategorieProduit cat = new CategorieProduit();
//        cat.setId_categorie(2);
//        cat.setNomCategorie("tsy manidina");
//        
//        Produit produit = new Produit();
//        produit.setId(3);
//        produit.setNomProduit("gana");
//        produit.setDateAchat(LocalDate.parse("2022-01-12"));
//        produit.setCategorie(cat);
//        
//        GenericDao.update(produit);
//        
//        try {
//            Produit produits = GenericDao.findById(Produit.class, 3);
//            System.out.println(produits.getId()+" : "+produits.getNomProduit()+" : "+produits.getDateAchat() );
//            System.out.println(produits.getCategorie().getId_categorie()+" : "+produits.getCategorie().getNomCategorie());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Dao test for remove with ManyToOne
//        CategorieProduit cat = new CategorieProduit();
//        cat.setId_categorie(2);
//        cat.setNomCategorie("tsy manidina");
//        
//        Produit produit = new Produit();
//        produit.setId(3);
//        produit.setNomProduit("gana");
//        produit.setDateAchat(LocalDate.parse("2022-01-12"));
//        produit.setCategorie(cat);
//        
//        GenericDao.remove(produit);

//      Dao test update with ManyToOne
//        CategorieProduit cat = new CategorieProduit();
//        cat.setId_categorie(2);
//        cat.setNomCategorie("tsy manidina");
//        
//        Produit produit = new Produit();
//        produit.setId(3);
//        produit.setNomProduit("gana");
//        produit.setDateAchat(LocalDate.parse("2022-01-12"));
//        produit.setCategorie(cat);
//        
//        GenericDao.insert(produit);
//        
    }
    
}
