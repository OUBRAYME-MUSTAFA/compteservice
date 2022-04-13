package com.example.compteservice.service;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {
    @Autowired
    private CompteRepository compterepository;
    @Override
    public void vriment(long codeSource, long codeDestination, double montant) {

        Compte c1 = compterepository.getById(codeSource);
        Compte c2 = compterepository.getById(codeDestination);
        c2.setSolde(montant+ c2.getSolde());
        c1.setSolde(c1.getSolde()-montant);

    }
}
