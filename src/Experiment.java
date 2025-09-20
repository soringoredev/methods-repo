public class Experiment {


    public int numar = 35;

    public static void abraCaDabra() {
        System.out.println("Abracadabra");
    }

    public static void vasea() {
        System.out.println("Vasile");
    }

    public int feghea() {
        return 45;
    }

    public String numeDeOras() {
        return "Paris";
    }

     public boolean aFostLectiaInteresanta() {
        return true;
     }

//
//     int a = 50;
//     int b = 25;
//     int c = -114;
//     int a = 50, int

     public int calculeazaSuma(int a, int b) {
        return a + b;
     }



    public static void main(String[] args) {
        primaMetoda();
    }




    public static void primaMetoda() {
        System.out.println("Prima metoda care o apeleaza pe aDouaMetoda()");
        aDouaMetoda();
        vasea();
    }

    public static void aDouaMetoda() {
        System.out.println("A doua metoda care o apeleaza pe abraCaDabra()");
        abraCaDabra();
    }

}
