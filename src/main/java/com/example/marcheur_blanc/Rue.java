package com.example.marcheur_blanc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rue {
    private String nom;
    private Lieu lieu1;
    private Lieu lieu2;

    public Rue(String nom, Lieu lieu1, Lieu lieu2) {
        this.nom = nom;
        this.lieu1 = lieu1;
        this.lieu2 = lieu2;
    }

    public Rue(Lieu lieu1, Lieu lieu2) {
        this.nom = null;
        this.lieu1 = lieu1;
        this.lieu2 = lieu2;
    }

    public Lieu getAutreLieu(Lieu lieu){
        if (lieu1 == lieu){
            return lieu2;
        }else if (lieu2 == lieu){
            return lieu1;
        }
        return null;
    }
}
