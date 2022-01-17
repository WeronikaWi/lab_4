public class Pracownik implements CzlowiekI {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String stanowisko;
    private double pensja;
    private int dniUrlopu;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko, double pensja, int dniUrlopu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
        this.dniUrlopu = dniUrlopu;
    }

    @Override
    public String getImie() {
        return imie;
    }

    @Override
    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public int getWiek() {
        return wiek;
    }

    @Override
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public int getDniUrlopu() {
        return dniUrlopu;
    }

    public void setDniUrlopu(int dniUrlopu) {
        this.dniUrlopu = dniUrlopu;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                ", dniUrlopu=" + dniUrlopu +
                '}';
    }
}
