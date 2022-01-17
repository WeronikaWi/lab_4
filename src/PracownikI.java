public interface PracownikI extends CzlowiekI{
    void setStanowisko(String stanowisko);
    void setPensja(double pensja);
    void setDniUrlopu(int value);

    String getStanowisko();
    double getPensja();
    int getDniUrlopu();
}
