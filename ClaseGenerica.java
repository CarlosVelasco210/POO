/*

 */
package Tarea1;

/**
 *
 * @author Windows
 */
public class ClaseGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GenericTupla<Double, Integer> tupla1 = new GenericTupla<>(4.2, 5);
        GenericTupla<Double, Integer> tupla2 = new GenericTupla<>(4.2, 5);
        boolean res = Utilities.compare(tupla1, tupla2);
        System.out.println ("Los objetos son iguales? " + res);
        
    }
    
}
