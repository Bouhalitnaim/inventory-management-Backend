package com.example.gestion.service.implementation;

import com.example.gestion.entity.Produit;
import com.example.gestion.repository.ProduitRepository;
import com.example.gestion.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Primary
public class ProduitService implements ICrudService<Produit,Long> {

    @Autowired
    private ProduitRepository produitRepository;


    @Override
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    @Override
    public void add(Produit produit) {
        produitRepository.save(produit);
    }

    @Override
    public void update(Produit produit) {
      produitRepository.save(produit);

    }

    @Override
    public void delete(Long id) {
      Produit produit = new Produit();
      produit.setId(id);
      produitRepository.delete(produit);



    }
}
