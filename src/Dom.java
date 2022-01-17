public class Dom implements Budynek{
//    public interface Budynek {
//        double powierzchnia(double pow);
//        String adresBudynku(String adres);
//        int liczbaOkien(int value);
//        void liczbaMieszkancow(int value);
//        void kolorDomu(KolorEnum kolor);
//        double czynsz(double cena_za_km2, double rachunki);
//
//    }

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
    @Override
    double powierzchnia(double pow)
    {
        this.powierzchnia = pow;
        return pow;
    }

}
