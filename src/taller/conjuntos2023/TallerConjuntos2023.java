
package taller.conjuntos2023;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TallerConjuntos2023 {

    public static void main(String[] args) {
        //PruebaSet PruebaSet = new PruebaSet();
        //PruebaSortedSet PruebaSortedSet = new PruebaSortedSet();
        Set<Persona> cjsp = new HashSet<Persona>();
        SortedSet<Persona> cjssp = new TreeSet<Persona>();
        Persona p = new Persona(1,"Marta",165);
        cjsp.add(p);
        cjssp.add(p);
        p = new Persona(2,"Elena",155);
        cjsp.add(p);
        cjssp.add(p);
        p = new Persona(3,"María",170);
        cjsp.add(p);
        cjssp.add(p);
        System.out.println("Personas en el conjunto: "+cjsp);
        System.out.println("Personas en el conjunto ordenado: "+cjssp);
    }
    
}
