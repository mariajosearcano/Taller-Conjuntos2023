package taller.conjuntos2023;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet {
    
 
    private static final String nombres[] = {"amarillo", "verde", "Negro", "carne", "gris", "blanco", "naranja", "rojo", "verde"};
//La creacion de vector con las características de private, static, final.
   
    public PruebaSortedSet() {
        SortedSet<String> arbol = new TreeSet<String>(Arrays.asList(nombres));
//SortedSet es una subinterfaz de Set que permite tener los elementos ordenados según su orden natural o un orden personalizado
        System.out.println("conjunto ordenado:");
        imprimirConjunto(arbol);
        System.out.print("\nheadSet(\"naranja\"):");
//se invoca al metodo headSet y se le manda el elemento naranja. El cual devuelve los elementos del SortedSet menores al elemento naranja
        imprimirConjunto(arbol.headSet("naranja"));
        System.out.print("tailSet(\"naranja\"):");
//tailSet es un metodo que devolverá los elementos iguales o mayores a naranja
        imprimirConjunto(arbol.tailSet("naranja"));
        System.out.printf("primero: %s \n", arbol.first());
        System.out.printf("ultimo: %s \n", arbol.last());
    }
//Se crea el TreeSet con la subinterfaz SortedSet y se imprime. Luego se invoca el headSet y luego el tailSet,y por último se imprime el primer y último elemento de la conexion
 
    private void imprimirConjunto(SortedSet<String> conjunto) {
        for (String s: conjunto) {
            System.out.print(s + "");
        }
        System.out.println ();
    }
//Este método imprime el contenido del SortedSet


}
