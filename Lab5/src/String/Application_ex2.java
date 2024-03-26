package String;

public class Application_ex2 {
    public static void main(String[] args) {
        String sir = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";

        //1. sa se afiseze lungimea
        System.out.println("\nLungimea sirului date este de "+sir.length()+" de caractere");

        //2. sa se afiseze true/false daca are doar litere mari si litere mici
        System.out.println("\nValoarea propozitiei 'Sirul dat are doar litere mari si litere mici' este "+sir.matches("[a-zA-Z]*") + "  //deoarece contine si spatii");

        //3. sa se imparta textul in cuvinte si sa se afiseze cuvintele de la mijloc
        String []v = sir.split("[ .,:;!?]+");
        System.out.println("\nCuvintele/cuvantul de la mijlocul sirului sunt/este: ");
        int lg = v.length;
        if((lg%2) == 0)
            System.out.println(v[lg/2-1]+" "+v[lg/2] + " //deoarece este un sir par");
        else
            System.out.println(v[lg/2] + " //deoarece este un sir impar");

        //4. se se afiseze stringul reverse (vezi StringBuilder)
        StringBuilder string_builder = new StringBuilder() ;

        for(int i = sir.length()-1; i>=0; i--)
            string_builder.append(sir.charAt(i));
        System.out.println("\nSirul inversat este: " + string_builder);

    }
}
