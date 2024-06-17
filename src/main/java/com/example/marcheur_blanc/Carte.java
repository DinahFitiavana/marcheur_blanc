package com.example.marcheur_blanc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class Carte {
    private Map<String, Lieu> lieux;
    private Map<String, Rue> rues;

    public void ajouterRue(String nom, Lieu lieu1, Lieu lieu2){
        if (lieu1 != null && lieu2 != null){
            Rue rue = new Rue(nom, lieu1, lieu2);
            rues.put(nom, rue);
        }
    }
}
