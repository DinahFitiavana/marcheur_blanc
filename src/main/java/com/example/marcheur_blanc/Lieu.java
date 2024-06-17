package com.example.marcheur_blanc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lieu {
    private String nom;

    public Lieu(String nom) {
        this.nom = nom;
    }
}
