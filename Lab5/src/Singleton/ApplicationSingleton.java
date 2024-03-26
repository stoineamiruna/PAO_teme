package Singleton;

public class ApplicationSingleton {
    public static void main(String[] args) {
        Facultati_Unibuc facultati_Unibuc1 = Facultati_Unibuc.getInstanceFacultati_Unibuc(); // cand il apelez prima data se va initializa
        Facultati_Unibuc facultati_Unibuc2 = Facultati_Unibuc.getInstanceFacultati_Unibuc(); // de fapt nu mai initializeaza nimic
        System.out.println(facultati_Unibuc1.equals(facultati_Unibuc2)); // intoarce true pt ca exista o singura instanta

        //metoda addInteger nu este statica deci vom folosi instantierea ca sa o apelam
        facultati_Unibuc1.addFacultate("Facultatea de Matematica si Informatica");
        facultati_Unibuc2.addFacultate("Facultatea de Limbi Straine");

        System.out.println(facultati_Unibuc1.getStocareFacultati());


    }
}
