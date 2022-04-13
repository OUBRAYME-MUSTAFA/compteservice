package com.example.compteservice.dtos;

import lombok.Data;

@Data
public class VrimentRequestDTO {
    private long codeSource;
    private long codeDestination;
    private double montant;

}
