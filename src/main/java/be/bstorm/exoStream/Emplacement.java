package be.bstorm.exoStream;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Emplacement {

    private static int COUNT = 1;
    private int numero;
    private TypeEmplacement typeEmplacement;
    private Taille taille;
    private List<Occupation> occupationList;

    public Emplacement(TypeEmplacement typeEmplacement, Taille taille, List<Occupation> occupation) {
        this.numero = COUNT++;
        this.typeEmplacement = typeEmplacement;
        this.taille = taille;
        this.occupationList = occupation;
    }

    public double calculerPrix(){
        int nombreTotalOccupant = this.occupationList.stream()
                .map(Occupation::getNbOccupants)
                .reduce(Integer::sum)
                .orElse(0);
        return nombreTotalOccupant * this.typeEmplacement.getPrice();
    }

    public boolean verifierOccupation(LocalDate dateOccupation){
        return this.occupationList.stream()
                .anyMatch(occupation -> (occupation.getDateArrivee().isBefore(dateOccupation) || occupation.getDateArrivee().isEqual(dateOccupation))
                        && (occupation.getDateDepart().isAfter(dateOccupation) || occupation.getDateDepart().isEqual(dateOccupation)));
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

    public List<Occupation> getOccupationList() {
        return occupationList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emplacement that = (Emplacement) o;
        return numero == that.numero && typeEmplacement == that.typeEmplacement && taille == that.taille && Objects.equals(occupationList, that.occupationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, typeEmplacement, taille, occupationList);
    }

    @Override
    public String toString() {
        return "Emplacement{" +
                "numero=" + numero +
                ", typeEmplacement=" + typeEmplacement +
                ", taille=" + taille +
                ", occupation=" + occupationList +
                '}';
    }

    public String toCSVString(){
        return numero + ";" + typeEmplacement + ";" + taille + ";[" + occupationList.stream().map(Occupation::toCSVString).collect(Collectors.joining()) + "]";
    }

}
