package com.example.compteservice;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.enums.TypeCompte;
import com.example.compteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CompteserviceApplication  {

    public static void main(String[] args) {

        SpringApplication.run(CompteserviceApplication.class, args);
    }

     @Bean
    CommandLineRunner strat(CompteRepository cpteRepository){
        return args -> {
            cpteRepository.save(new Compte(null, 903993, new Date(), TypeCompte.COURANT));
            cpteRepository.save(new Compte(null, 888888, new Date(), TypeCompte.EPARGNE));
            cpteRepository.save(new Compte(null, 788477, new Date(), TypeCompte.COURANT));
            cpteRepository.findAll().forEach(cp ->{
                System.out.println("**********************************");
                System.out.println("type = "+cp.getType());
                System.out.println("code = "+cp.getSolde());

            });
        };
     }
}
