import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */

        int tab[] = {5, 78, -87, 56, 2, 0};
        Scanner scan = new Scanner(System.in);
        int index = -1;
        boolean isIndexCorrect = false;
        while (!isIndexCorrect) {
            System.out.println("Podaj numer indeksu: ");
            try {
                index = Integer.parseInt(scan.next());

            } catch (NumberFormatException e) {
                System.out.println("Błąd. Podałeś znak inny niż liczba całkowita");
                continue;
            }


            try {
                System.out.println(tab[index]);
                isIndexCorrect = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Błąd. Podałeś za dużą liczbę. Dozwolone są liczby od 0 do 5");

            } finally {
                System.out.println("koniec programu");
            }

        }

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */
        Osoba osoba = null;

        try {
            osoba.getImie();
        } catch (NullPointerException e) {
            System.out.println("Błąd. Nie można pobrac imienia, bo osoba nie istnieje");

        }

        int a = 5, b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Nie można dzielić przez 0");
        }

        int x;
        System.out.println("Podaj x: ");
        try {
            x = Integer.parseInt(scan.next());
            System.out.println("5 / " + x + " = " + 5 / x);
        } catch (NumberFormatException e) {
            System.out.println("Błąd. Podałeś znak inny niż liczba całkowita");
        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez zero");
        } finally {
            System.out.println("koniec programu");
        }


    }
}