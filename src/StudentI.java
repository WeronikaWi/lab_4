public interface StudentI extends CzlowiekI {
    void setNumerIndeksu(int numer);

    void setKierunek(String kierunek);

    void setSemestr(int semestr);

    int getNumerIndeksu();

    String getKierunek();

    int getSemestr();
}
