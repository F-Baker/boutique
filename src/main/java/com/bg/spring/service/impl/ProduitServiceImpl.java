package com.bg.spring.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.bg.hibernate.model.Produit;
import com.bg.spring.dao.ProduitDao;
import com.bg.spring.service.ProduitService;

public class ProduitServiceImpl implements ProduitService {
	@Autowired
	private ProduitDao produitDao;

	@Override
	public Produit getProduit(int id) {
		return produitDao.getProduit(id);
	}

	@Override
	public List<Produit> getAllProduit() {
		return produitDao.getAllProduit();
	}

	public ProduitDao getProduitDao() {
		return produitDao;
	}

	@Override
	public void ajouterProduit(Produit produit) {
		if (produit != null) {
			produitDao.ajouterProduit(produit);

		}
	}
	
	@Override
	public List<Produit> filtrerProduits(int idCat, String nomProduit) {
		return produitDao.filtrerProduits(idCat, nomProduit);
	}

	@Override
	public List<Produit> getProduitByPrice(Double prix) {
		return produitDao.getProduitByPrice(prix);
	}

	@Override
	public List<Produit> getProduitsFilter(int idCat, String nomProduit, Double prix) {
		return produitDao.filtrerProduits(idCat, nomProduit, prix);
	}
}
