package taller.conjuntos2023;


import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class PruebaSet {
    
 
    private static final String colores[] = {"rojo", "blanco", "azul", "verde", "gris", "naranja", "carne", "blanco", "cyan", "gris", " naranja"};
//static indica que es una variable que pertenece a la clase y no solo a una instancia de ella
//final significa que la variable no puede cambiar su valor
//Aquí se crea un vector privado como atributo de la clase, con las características de static y final 
    
    public PruebaSet() {
        List<String> lista = Arrays.asList(colores);
        System.out.printf("ArrayList: %s \n", lista);
//%s sirve para formatear a cadenas de texto y poder mostrarlo por consola. De esta manera, podemos mostrar los elementos de lista como String
        imprimirSinDuplicados(lista);
    }
//Este método crea un List al cual se le guardan los elementos del vector colores y se imprime dicha lista ya llena. Luego invoca el método imprimirSinDuplicados.
 
    private void imprimirSinDuplicados(Collection<String> coleccion) {
        Set<String> conjunto = new HashSet<String>(coleccion);
        System.out.println("\nLos valores sin duplicados son: ");
        for (String s: conjunto) {
            System.out.printf ("%s", s);
        }
        System.out.println();
    }
//Aqui llega como parametro una Collection tipo String, luego se crea un HashSet tipo String y se llena con los elementos de la colección que se envia.
//Esto se hace con el fin de eliminar los elementos duplicados y dejar solo una original. Por eso se mete al HashSet, pues este no permite elementos duplicados.
//Se recorre el HashSet con un for-each y se muestran todos sus elementos
 

    
}
