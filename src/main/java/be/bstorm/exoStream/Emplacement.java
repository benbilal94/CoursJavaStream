package be.bstorm.exoStream;

import java.awt.*;

public class Emplacement {
    private int numero;
    private TypeEmplacement typeEmplacement;
    private Taille taille;
    private Occupation occupation;
    private double prixTotal;
    private boolean estOccupee;

    public Emplacement(int numero, TypeEmplacement typeEmplacement, Taille taille, Occupation occupation, double prixTotal, boolean estOccupee) {
        this.numero = numero;
        this.typeEmplacement = typeEmplacement;
        this.taille = taille;
        this.occupation = occupation;
        this.prixTotal = prixTotal;
        this.estOccupee = estOccupee;
    }


    public int getNumero() {
        return numero;
    }

    public TypeEmplacement getTypeEmplacement() {
        return typeEmplacement;
    }

    public Taille getTaille() {
        return taille;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public boolean isEstOccupee() {
        return estOccupee;
    }
}
