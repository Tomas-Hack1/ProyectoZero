/*
Pedir 3 numeros enteros y nos dice si todos son negativos o si ay alguno positivo.
 */
package practicasejercises;

import java.util.Scanner;

/**
 *
 * @author Tomas M             221422
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Escriba tres numeros");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a<0)
            System.out.println("A es negativo");
        else if(a==0)
            System.out.println("A vale 0");
        else if(a>0)
            System.out.println("A es positivo");
        if(b<0)
            System.out.println("B es negativo");
        else if(b==0)
            System.out.println("B vale 0");
        else if(b>0)
            System.out.println("B es positivo");
        if(c<0)
            System.out.println("C es negativo");
        else if(c==0)
            System.out.println("C vale 0");
        else if(c>0)
            System.out.println("C vale positivo");
        
    }
}