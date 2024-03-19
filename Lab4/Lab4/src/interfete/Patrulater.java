package interfete;


public class Patrulater implements Calcul{
    private double l1;
    private double l2;
    private double l3;
    private double l4;

    public Patrulater() {

    }
    public Patrulater(double l1, double l2, double l3, double l4){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }


    @Override
    public double calculPerimetru(){
        return this.l1+this.l2+this.l3+this.l4;
    }
}
