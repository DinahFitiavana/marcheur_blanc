package com.example.marcheur_blanc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class MarcheurTest {
    private Lieu HEI;
    private Lieu Pullman;
    private Lieu Balancoire;
    private Lieu ESTI;
    private Carte carte;

    @BeforeEach
    public void setUp() {
        HEI = new Lieu("HEI");
        Pullman = new Lieu("Pullman");
        Balancoire = new Lieu("Balancoire");
        ESTI = new Lieu("ESTI");

        Map<String, Lieu> lieux = new HashMap<>();
        lieux.put(HEI.getNom(), HEI);
        lieux.put(Pullman.getNom(), Pullman);
        lieux.put(Balancoire.getNom(), Balancoire);
        lieux.put(ESTI.getNom(), ESTI);

        Map<String, Rue> rues = new HashMap<>();
        Rue rue1 = new Rue("Andriatsihoarana", Pullman, HEI );
        Rue rue2 = new Rue("Ranaivo", Balancoire, Pullman);
        Rue rue3 = new Rue("SansNom", ESTI, Balancoire );
        rues.put("Andriatsihoarana", rue1);
        rues.put("Ranaivo", rue2);
        rues.put("SansNom", rue3);

        carte = new Carte(lieux, rues);
    }

    @Test
    public void testMarcherVersESTI() {
        Marcheur marcheur = new Marcheur( HEI);
        Trajet trajet = marcheur.marcher(HEI, ESTI, carte);

        assertNotNull(trajet);
        assertFalse(trajet.getTrajet().isEmpty());
        assertEquals(HEI, trajet.getTrajet().get(0));
        assertEquals(ESTI, trajet.getTrajet().get(trajet.getTrajet().size() - 1));
        System.out.println("Trajet parcouru :");
        for (Lieu lieu : trajet.getTrajet()) {
            System.out.println(lieu.getNom());
        }
    }

        /*assertEquals(getFirst,getLast);
        asserTrue(trajet.size() >= 3);*/
}
