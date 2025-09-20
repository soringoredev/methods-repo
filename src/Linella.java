import java.util.Scanner;

public class Linella {
    public static void main(String[] args) {


        Scanner denumire = new Scanner(System.in);

        // obiect al clasei Experiment
        Experiment nustiu = new Experiment();

       // Experiment.primaMetoda();
        // statice
        Experiment.primaMetoda();
        Experiment.aDouaMetoda();
        Experiment.vasea();
        Experiment.abraCaDabra();

        // non-statice
        System.out.println(nustiu.numar);
        System.out.println(nustiu.feghea());
        nustiu.calculeazaSuma(50,20);

    }
}
