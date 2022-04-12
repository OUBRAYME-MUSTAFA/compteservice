package com.example.compteservice.web;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.repositories.CompteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompteRestComtroller {

    private CompteRepository compterepository;

    public CompteRestComtroller(CompteRepository compte_repository) {
        this.compterepository = compte_repository;
    }

    @GetMapping(path = "/comptes")
    public List<Compte> listComptes()
    {
        return compterepository.findAll();
    }

    @GetMapping(path = "/comptes/{id}")
    public Compte getComptes(@PathVariable(name = "id") long code)
    {
        return compterepository.findById(code).get();
    }

    @PostMapping(path = "/comptes")
    public Compte addCompte(@RequestBody Compte compte) {
        return compterepository.save(compte);
    }

    @PutMapping(path = "/comptes/{code}")
    public Compte addCompte(@PathVariable (name = "code") long code , @RequestBody Compte compte) {
        compte.setCode(code);
        return compterepository.save(compte);
    }

    @DeleteMapping(path = "/comptes/{code}")
    public void deleteCompte(@PathVariable (name = "code") long code ) {

         compterepository.deleteById(code);
    }

}
