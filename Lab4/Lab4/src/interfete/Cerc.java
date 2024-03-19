package interfete;

public class Cerc implements Calcul {
    private double raza;

    public Cerc(){}

    public Cerc(double raza){
        this.raza = raza;
    }
    @Override
    public double calculPerimetru() {
        return 2*Math.PI* this.raza;
    }
}
