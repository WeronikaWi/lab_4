public class Prostokat extends Figura {
    private double bok1, bok2;

    public Prostokat() {
    }

    public Prostokat(double bok1, double bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    public double getBok1() {
        return bok1;
    }

    public void setBok1(double bok1) {
        this.bok1 = bok1;
    }

    public double getBok2() {
        return bok2;
    }

    public void setBok2(double bok2) {
        this.bok2 = bok2;
    }

    public double pole() {
        return bok1 * bok2;
    }

    public double obwod() {
        return bok1 * 2 + bok2 * 2;
    }

    @Override
    public String toString() {
        return "Prostokat o bokach " + bok1 + " i " + bok2 + " ma pole " + pole() + " i obwód " + obwod();
    }
}
