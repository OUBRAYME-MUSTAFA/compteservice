package com.example.compteservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = Compte.class)
public interface CompteProj1 {
     Long getCode();
     Long getSolde();
}
