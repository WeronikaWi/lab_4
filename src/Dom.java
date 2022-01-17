/* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

public class Dom implements Budynek {

    private double powierzchnia;
    private String adres;
    private int liczbaOkien;
    private int liczbaMieszkancow;
    private KolorEnum kolorDomu;

    public Dom(double powierzchnia, String adres, int liczbaOkien, int liczbaMieszkancow, KolorEnum kolorDomu) {
        this.powierzchnia = powierzchnia;
        this.adres = adres;
        this.liczbaOkien = liczbaOkien;
        this.liczbaMieszkancow = liczbaMieszkancow;
        this.kolorDomu = kolorDomu;
    }

    public Dom() {
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }


    public String getAdres() {
        return adres;
    }


    public int getLiczbaOkien() {
        return liczbaOkien;
    }


    public int getLiczbaMieszkancow() {
        return liczbaMieszkancow;
    }


    public KolorEnum getKolorDomu() {
        return kolorDomu;
    }


    @Override
    public double powierzchnia(double pow) {
        this.powierzchnia = pow;
        return pow;
    }

    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }

    public int liczbaOkien(int value) {
        this.liczbaOkien = value;
        return value;
    }

    public void liczbaMieszkancow(int value) {
        this.liczbaMieszkancow = value;
    }

    public void kolorDomu(KolorEnum kolor) {
        this.kolorDomu = kolor;
    }

    public double czynsz(double cena_za_m2, double rachunki) {
        return (cena_za_m2 * powierzchnia + rachunki) / liczbaMieszkancow;
    }

    public double kosztMyciaOkien(double cena_za_okno) {
        return cena_za_okno * liczbaOkien;
    }


    public void podsumowanie(double cena_za_m2, double rachunki, double cena_za_okno) {
        System.out.println("Dom{" +
                "powierzchnia=" + powierzchnia + ",\n" +
                "adres=" + adres + ",\n" +
                "liczbaOkien=" + liczbaOkien + ",\n" +
                "liczbaMieszkancow=" + liczbaMieszkancow + ",\n" +
                "kolorDomu=" + kolorDomu + ",\n" +
                "czynsz na mieszkańca=" + czynsz(cena_za_m2, rachunki) + ",\n" +
                "cena za umycie okien=" + kosztMyciaOkien(cena_za_okno) + ",\n" +
                '}');
    }

    @Override
    public String toString() {
        return "Dom{" +
                "powierzchnia=" + powierzchnia + ",\n" +
                "adres=" + adres + ",\n" +
                "liczbaOkien=" + liczbaOkien + ",\n" +
                "liczbaMieszkancow=" + liczbaMieszkancow + ",\n" +
                "kolorDomu=" + kolorDomu +
                '}';
    }
}
