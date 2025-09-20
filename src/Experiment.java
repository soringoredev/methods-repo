public class Experiment {
    public static void main(String[] args) {
        primaMetoda();
    }

    public static void primaMetoda() {
        System.out.println("Prima metoda care o apeleaza pe aDouaMetoda()");
        aDouaMetoda();
    }

    public static void aDouaMetoda() {
        System.out.println("A doua metoda care o apeleaza pe abraCaDabra()");
        abraCaDabra();
    }

    public static void abraCaDabra() {
        System.out.println("Abracadabra");
    }
}
