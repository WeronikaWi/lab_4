public class Student implements StudentI{
    private String imie;
    private String nazwisko;
    private int wiek;
    private int numerIndeksu;
    private String kierunek;
    private int semestr;

    public Student() {
    }

    public Student(String imie, String nazwisko, int wiek, int numerIndeksu, String kierunek, int semestr) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.numerIndeksu = numerIndeksu;
        this.kierunek = kierunek;
        this.semestr = semestr;
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

    @Override
    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    @Override
    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    @Override
    public String getKierunek() {
        return kierunek;
    }

    @Override
    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public int getSemestr() {
        return semestr;
    }

    @Override
    public void setSemestr(int semestr) {
        this.semestr = semestr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", numerIndeksu=" + numerIndeksu +
                ", kierunek='" + kierunek + '\'' +
                ", semestr=" + semestr +
                '}';
    }
}
