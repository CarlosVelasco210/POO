/*
 */
package Tarea1;

/**
 *
 * @author Windows
 */
public class Utilities {
    
    public static <T> boolean compare (T tupla1, T tupla2){
        GenericTupla point1 = (GenericTupla) tupla1;
        GenericTupla point2 = (GenericTupla) tupla2;
        return point1.getKey().equals(point2.getKey()) && point1.getValue().equals(point2.getValue());
        
    }
    
}
