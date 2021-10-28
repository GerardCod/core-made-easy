package operators;

/**
 * Ejercicio de operadores a nivel de bits
 */
public class BitwiseOperators {
  public static void main(String[] args) {
    System.out.println(true & true); // Evalua que ambos valores sean true.
    System.out.println(false | false); // Evalua que al menos un valor sea true o que ambos lo sean.
    System.out.println(false ^ true); // Evalua que ambos valores sean distintos.

    // Realiza la misma evaluación & que con booleanos pero a nivel de bits.
    /**
     * Por ejemplo:
     * 4 -> 100
     * 5 -> 101
     * 
     * 4 & 5 -> 100
     *          101
     *          ---
     *          100 -> 4
     */
    System.out.println(4 & 5); 

    /**
     * Realiza la misma evaluación de | pero a nivel de bits.
     * Por ejemplo:
     * 4 | 5 -> 100
     *          101
     *          ---
     *          101 -> 5
     */
    System.out.println(4 | 5);

    /**
     * Hace la misma evaluación ^ pero a nivel de bits.
     * 4 ^ 5 -> 100
     *          101
     *          ---
     *          001 -> 1 
     */
    System.out.println(4 ^ 5);

    /**
     * Solo funciona con números enteros y realiza un cambio de valores a nivel de bits.
     * 4 -> 100
     * ~4 -> 001
     */
    System.out.println(~4);
  }
}
