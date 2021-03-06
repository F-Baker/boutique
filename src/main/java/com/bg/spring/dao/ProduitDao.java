package com.bg.spring.dao;

import java.util.List;

import com.bg.hibernate.model.Produit;

public interface ProduitDao {
    public Produit getProduit(int id);
    public List<Produit> getAllProduit();
	public void ajouterProduit(Produit produit);
	public List<Produit> getProduitsByCategorie(int idCat, String nomProduit, Double prix);
	public void supprimerProduit(Produit produit);
}

