
package taller.conjuntos2023;

    
    /* Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet */
import java.util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Persona implements Comparable<Persona>{
//Comparable es una interfaz que permite establecer un orden para los elementos de la clase
    private int idPersona;       
    private String nombre;       
    private int altura;

    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;   
        this.nombre = nombre;    
        this.altura = altura;
    }
//Este es el método constructor de la clase Persona

    @Override     
//Override indica que este método se esta sobrescribiendo a otro método de una interfaz o superclase
    public String toString() { return "Persona-> ID: "+idPersona+" Nombre: "+nombre+" Altura: "+altura+"\n";  }
//Este método convierte el objeto en String para permitir mostrarlo

    @Override     
    public int compareTo(Persona o) { return this.altura-o.altura; }
//Este método compara dos objetos. En este caso, compara la altura de la persona actual y la que le mandamos. Lo logra restándolas. Si devuelve un valor positivo es porque la altura actual es mayor, si devuelve cero son iguales y si devuelve negativo es que la altura enviada es mayor.

    @Override     
    public int hashCode() { return altura + nombre.hashCode() + idPersona; }
//Este método permite crear un hashCode único para cada objeto. Es un valor numérico.
//En este caso, se crea sumando la altura, el hashcode del nombre y el id de la persona.

    @Override     
    public boolean equals(Object obj) {
        if (obj == null) {   return false;  }
//si el objeto pasado como parámetro es nulo, devuelve false
        if (getClass() != obj.getClass()) {  return false;   }
//si la clase del objeto actual no es igual a la clase pasada como parámetro devuelve false
        final Persona other = (Persona) obj;
//Convierte el objeto pasado como parámetro a tipo Persona
        if (this.idPersona != other.idPersona) {  return false;    }
//si el idPersona del objeto actual es diferente al del objeto pasado, devuelve false
        if (!Objects.equals(this.nombre, other.nombre)) {    return false;     }
//compara el nombre del objeto actual con el del pasado con el método equals de la clase Objects, si son diferentes devuelve false
        if (this.altura != other.altura) {     return false;   }
//compara la altura del objeto actual con la del objeto pasado, si son diferentes devuelve false
        return true;
//si logra pasar todos los condicionales y no cumple ninguno de ellos, devuelve true
    }
//Este método lo que hace es comprobar si ambos objetos son iguales (son el mismo)
}
 
/* Ejemplo Interface Set y SortedSet, clase HashSet y TreeSet  */


    
