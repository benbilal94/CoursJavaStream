package be.bstorm.exoStream;

public enum TypeEmplacement {
    TENTE(35.95),
    CARAVANE(60.50),
    BUNGALOW(120.95),
    MOBILHOME(45.99);

    private double price;

    TypeEmplacement(double price) {
        this.price = price;
    }
}
