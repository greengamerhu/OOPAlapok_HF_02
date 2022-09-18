package hu.petrik.OOPalapok.kor;

public class Kor {
    private int x;
    private int y;
    private int r;

    public Kor(int x,  int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Kor(int r) {
        this.x = 0;
        this.y = 0;
        this.r = r;
    }
    public Kor() {
        this.x = (int) (Math.random() * (2 * 10 + 1)) - 10;
        this.y = (int) (Math.random() * (2 * 10 + 1)) - 10;
        this.r = (int)(Math.random() * ((10 - 1) + 1)) + 1;

    }
    public double getKerulet() {
        return 2 * this.r * Math.PI;
    }
    public double getTerulet() {
        return Math.pow(this.r, 2) * Math.PI;
    }
    public void korMerete(String irany, int ertek) {
        if (!irany.equals("-") && !irany.equals("+")) {
            System.out.println("Rossz adatot adtál meg");
        } else if (irany.equals("-") && (this.r - ertek > 0) ) {
            this.r -= ertek;
        } else {
            this.r += ertek;

        }
    }
    @Override
    public String toString() {
        return  String.format("(%d, %d, %d)",this.x, this.y, this.r);
    }
}
