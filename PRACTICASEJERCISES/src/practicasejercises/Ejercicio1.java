/*
En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
 */
/*
@autor    Tomas M               221422
*/
package practicasejercises;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroequipos,totalcompra,totalpago,descuento;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresar el numero de equipos a comprar: ");
        numeroequipos=in.nextInt();
        if(numeroequipos<5){
            totalcompra=numeroequipos*500;
            descuento=(int) (totalcompra*0.10);
            totalpago=totalcompra-descuento;
            System.out.println("El valor de la compra sin descuento es U$ : "+ totalcompra);
            System.out.println("El descuento es de U$ : "+ descuento);
            System.out.println("El valor total es: U$ "+ totalpago);
        }
        else if(numeroequipos>=5 && numeroequipos<10) {
            totalcompra=numeroequipos*500;
            descuento=(int) (totalcompra*0.20);
            totalpago=totalcompra-descuento;
            System.out.println("El valor de la compra sin descuento es U$ : "+ totalcompra);
            System.out.println("El descuento es de U$ : "+ descuento);
            System.out.println("El valor total es U$ : "+ totalpago);
        }
        else if(numeroequipos>=10){
            totalcompra=numeroequipos*500;
            descuento=(int) (totalcompra*0.40);
            totalpago=totalcompra-descuento;
            System.out.println("El valor de la compra sin descuento es U$: "+ totalcompra);
            System.out.println("El descuento es de U$: "+ descuento);
            System.out.println("El valor total es U$: "+ totalpago);
        }
        else
            System.out.println("No existe descuento");
    }
}
        
    

        
    
