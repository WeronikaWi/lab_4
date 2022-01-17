public class Kierownik implements PracownikI {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String stanowisko = "kierownik";
    private double pensja;
    private int dniUrlopu;
    private String dzial;

    public Kierownik() {
    }

    public Kierownik(String imie, String nazwisko, int wiek, double pensja, int dniUrlopu, String dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pensja = pensja;
        this.dniUrlopu = dniUrlopu;
        this.dzial = dzial;
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

    public String getDzial() {
        return dzial;
    }

    public void setDzial(String dzial) {
        this.dzial = dzial;
    }

    @Override
    public String toString() {
        return "Kierownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                ", dniUrlopu=" + dniUrlopu +
                ", dział=" + dzial +
                '}';
    }
}


