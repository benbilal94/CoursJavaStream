package be.bstorm.exoStream.generateur;

import be.bstorm.exoStream.Emplacement;
import be.bstorm.exoStream.Occupation;
import be.bstorm.exoStream.Taille;
import be.bstorm.exoStream.TypeEmplacement;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateurData {

    private static Random random = new Random();
    public static List<Emplacement> generateurEmplacementRandom(int nb){

        List<Emplacement> output = new ArrayList<>(nb);

        for (int i = 0; i < nb ; i++) {

            Emplacement e = generateurEmplacementRandom();
            output.add(e);
        }

        return output;
    }

    private static Emplacement generateurEmplacementRandom() {

        return new Emplacement(genererTypeEmplacement(),genererTaille(),genererListOccupation());

    }

    private static TypeEmplacement genererTypeEmplacement(){
        return TypeEmplacement.values()[random.nextInt(TypeEmplacement.values().length)];
    }

    private static Taille genererTaille(){
        return Taille.values()[random.nextInt(Taille.values().length)];
    }

    private static List<Occupation> genererListOccupation(){
            List<Occupation> output =new ArrayList<>(semaineOccupation.values().length);
        for (int i = 0; i < semaineOccupation.values().length; i++) {
            if (random.nextBoolean())
            output.add(
                    new Occupation(
                            semaineOccupation.values()[i].getDateMin(),
                            semaineOccupation.values()[i].getDateMax(),
                            random.nextInt(1,7)
                    )
            );
        }
        return output;
    }

    enum semaineOccupation {
        SEMAINE_1(LocalDate.of(2023,7,3),LocalDate.of(2023,7,9)),
        SEMAINE_2(LocalDate.of(2023,7,10),LocalDate.of(2023,7,16)),
        SEMAINE_3(LocalDate.of(2023,7,17),LocalDate.of(2023,7,23)),
        SEMAINE_4(LocalDate.of(2023,7,24),LocalDate.of(2023,7,30)),
        SEMAINE_5(LocalDate.of(2023,7,31),LocalDate.of(2023,8,6)),
        SEMAINE_6(LocalDate.of(2023,8,7),LocalDate.of(2023,8,13)),
        SEMAINE_7(LocalDate.of(2023,8,14),LocalDate.of(2023,8,20)),
        SEMAINE_8(LocalDate.of(2023,8,21),LocalDate.of(2023,8,27));

        private LocalDate dateMin;
        private LocalDate dateMax;

        semaineOccupation(LocalDate dateMin, LocalDate dateMax) {
            this.dateMin = dateMin;
            this.dateMax = dateMax;
        }

        public LocalDate getDateMin() {
            return dateMin;
        }

        public LocalDate getDateMax() {
            return dateMax;
        }
    }
}
