/*
Realiza un programa que pida una ora por teclado y que muestre luego buenos dias, buenas tardes y buenas noces
segun la ora. Se utilizaran los tramos de 6 a 12, de 13,a 20 y de 21 a 5 respectivamente. solo se tienen 
en cuenta las oras, los minutos no se deben introducir por teclado. Escribelo en lenuaje java por teclado
 */
package practicasejercises;

import java.util.Scanner;

/**
 *
 * @author Tomas M    221422
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int ora;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ora sin introducir los minutos");
        ora=scanner.nextInt();
        if(ora>=6 && ora<13)
            System.out.println("Buenos dias querido usuario");
        else if(ora>=13 && ora<=20)
            System.out.println("Buenas tardes querido usuario");
        else
            System.out.println("Buenas noces querido usuario");
    }
}
