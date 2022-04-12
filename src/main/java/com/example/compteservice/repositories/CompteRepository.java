package com.example.compteservice.repositories;

import com.example.compteservice.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompteRepository extends JpaRepository<Compte,Long>{

}
