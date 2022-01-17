public class Kwadrat extends Figura{
    private double bok;

    public Kwadrat() {
    }

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    public double pole()
    {
        return bok*bok;
    }

    public double obwod()
    {
        return bok*4;
    }

    @Override
    public String toString() {
        return "Kwadrat o boku " + bok + " ma pole " + pole() + " i obwód " + obwod();
    }
}
