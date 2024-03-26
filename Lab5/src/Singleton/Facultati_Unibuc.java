package Singleton;

import java.util.ArrayList;
import java.util.List;

public class Facultati_Unibuc {
    private static Facultati_Unibuc facultati_Unibuc;
    private List<String> stocareFacultati = new ArrayList<>();
    private Facultati_Unibuc(){}

    public static Facultati_Unibuc getInstanceFacultati_Unibuc(){
        if(facultati_Unibuc == null){
            facultati_Unibuc = new Facultati_Unibuc();
        }
        return facultati_Unibuc;
    }

    public List<String> getStocareFacultati() {
        return stocareFacultati;
    }

    public void addFacultate(String name){
        stocareFacultati.add(name);
    }
}
