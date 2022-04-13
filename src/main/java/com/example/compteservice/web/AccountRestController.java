package com.example.compteservice.web;

import com.example.compteservice.dtos.VrimentRequestDTO;
import com.example.compteservice.repositories.CompteRepository;
import com.example.compteservice.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class AccountRestController {
    @Autowired
    private CompteService compteService;

    @PutMapping("comptes/virement")
    public void virement(@RequestBody VrimentRequestDTO request)
    {
       compteService.vriment(request.getCodeSource(), request.getCodeDestination(), request.getMontant());
    }
}
