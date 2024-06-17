package com.example.marcheur_blanc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Trajet {
    private List<Lieu> trajet;
}
