/* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

public abstract class Figura {
    abstract double pole();

    abstract double obwod();

    void nazwaFigury(String figura) {
        System.out.println("To jest figura: " + figura);
    }

}
