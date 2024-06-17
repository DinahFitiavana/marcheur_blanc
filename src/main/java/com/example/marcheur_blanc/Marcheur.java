package com.example.marcheur_blanc;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Marcheur {
    private Lieu positionActuelle;
    private Random random;

    public Marcheur(Lieu positionActuelle) {
        this.positionActuelle = positionActuelle;
        this.random = new Random();
    }

    public Trajet marcher(Lieu depart, Lieu arrive, Carte carte){
       List<Lieu> parcours = new ArrayList<>();
       parcours.add(depart);
       positionActuelle = depart;

       while (positionActuelle == arrive){
           List<Rue> rueATraverser = new ArrayList<>();
           for (Rue rue : carte.getRues().values()){
               if (positionActuelle == rue.getLieu1() || positionActuelle == rue.getLieu2()){
                   rueATraverser.add(rue);
               }
           }
           if (rueATraverser.isEmpty()) break;
           Rue rueAleatoire = rueATraverser.get(random.nextInt(rueATraverser.size()));
           positionActuelle = rueAleatoire.getAutreLieu(positionActuelle);
           parcours.add(positionActuelle);
       }
       return new Trajet(parcours);
    }
}
