/*
En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.
 */
/*
@autor                     221422
*/
package practicasejercises;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int llantas,total,vpll;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresar el numero de llantas a comprar: ");
        llantas=in.nextInt();
        if(llantas<5){
           total=llantas*100;
            System.out.println("El valor de cada llanta es de: "+ 100);
            System.out.println("El valor total de la compra es de: "+ total);
        } else if(llantas>=5 && llantas<10){
            total=llantas*75;
            System.out.println("El valor de cada llanta es de: "+ 75);
            System.out.println("El valor total de la compra es de: "+ total);
        } 
        else if(llantas>=10){
        total=llantas*50;
         System.out.println("El valor de cada llanta es de:"+ 50);
         System.out.println("El valor total de la compra es de:"+ total);}
        else
            System.out.println("no existe descuento");
    }
}