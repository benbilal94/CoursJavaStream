package be.bstorm.exoStream;

public enum Taille {
    S(10,15),
    M(16,30),
    L(31,50);

    private int minM;
    private int maxM;

    Taille(int minM, int maxM) {
        this.minM = minM;
        this.maxM = maxM;
    }
    public int getMinM() {
        return minM;
    }

    public int getMaxM() {
        return maxM;
    }

}
