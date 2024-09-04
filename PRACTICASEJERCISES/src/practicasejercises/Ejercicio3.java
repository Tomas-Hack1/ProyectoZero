/*
Crear un programa que pide un nombre por Scanner y escribe en consola “buenas tardes, Sr XX”
(evidentemente, sustituyendo XX por el nombre que se escriba en consola)
 */

/*
@autor Tomas M     221422
*/
package practicasejercises;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        String nombre = input.next();
        System.out.println("Buenas tardes, Sr "+ nombre);
    }
}
