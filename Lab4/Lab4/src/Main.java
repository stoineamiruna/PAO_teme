import interfete.Cerc;
import interfete.Patrulater;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        interfete();
    }
    private static void interfete(){
        double l1=1, l2=2, l3=3, l4=4;

        Patrulater patrulater = new Patrulater(l1,l2,l3,l4);
        System.out.println("Perimetrul pentru patrulater: "+ patrulater.calculPerimetru());

        double raza = 4;
        Cerc cerc = new Cerc(raza);
        System.out.println("Perimetrul pentru cerc: "+ cerc.calculPerimetru());
    }
}