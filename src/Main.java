import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów

        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        Student student1 = new Student();
        student1.setImie("Arek");
        student1.setNazwisko("Nowak");
        student1.setWiek(23);
        student1.setNumerIndeksu(12345);
        student1.setKierunek("informatyka");
        student1.setSemestr(3);


        Student student2 = new Student();
        student2.setImie("Ola");
        student2.setNazwisko("Kowalska");
        student2.setWiek(22);
        student2.setNumerIndeksu(43215);
        student2.setKierunek("mechanika");
        student2.setSemestr(5);

        Pracownik pracownik1 = new Pracownik();
        pracownik1.setImie("Iwona");
        pracownik1.setNazwisko("Polna");
        pracownik1.setWiek(43);
        pracownik1.setStanowisko("programista");
        pracownik1.setPensja(5000);
        pracownik1.setDniUrlopu(20);

        Pracownik pracownik2 = new Pracownik();
        pracownik2.setImie("Olaf");
        pracownik2.setNazwisko("Górski");
        pracownik2.setWiek(32);
        pracownik2.setStanowisko("ochroniarz");
        pracownik2.setPensja(3500);
        pracownik2.setDniUrlopu(15);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(pracownik1);
        System.out.println(pracownik2);

       /* zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
                d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */
        System.out.println("Zadanie dodatkowe: ");

        Kierownik kierownik1 = new Kierownik("Olga", "Nowicka", 36, 6000, 34, "marketing");
        Kierownik kierownik2 = new Kierownik("Felix", "Tyrski", 41, 5500, 32, "produkcja");
        PracownikI pracownik3 = new Pracownik();
        List<PracownikI> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(pracownik1);
        listaPracownikow.add(pracownik2);
        listaPracownikow.add(kierownik1);
        listaPracownikow.add(kierownik2);

        for (PracownikI pracownik : listaPracownikow) {
            System.out.println(pracownik);
        }


    }


}
