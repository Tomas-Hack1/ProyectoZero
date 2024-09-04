/*
Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar
de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de
otra canasta, los premios se dan bajo la siguiente tabla:
HOMBRES                 MUJERES
# Bolita Premio      # bolita Premio
1 Desodorante           1 Loción
2 Six-Pack de cerveza    2 Bikini
3 Camiseta               3 Crema para la cara
4 Pantaloneta            4 Plancha para el cabello
5 Sudadera               5 Esmalte de uñas
 */
/*
@autor   Tomas M             221422
*/
package practicasejercises;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String m, f, sexo = null;
        int nbola;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su sexo (m o f): ");
        m=input.next();
        f=input.next();
        if(sexo==m) {
            System.out.println("Saque el numero de bola y indique cual es el numero de bola");
            nbola=input.nextInt();
            switch (nbola){
                case 1 -> {
                    if (nbola==1)
                        System.out.println("a sido el ganador de un desodorante ");
                }
                case 2 -> {
                    if (nbola==2)
                        System.out.println("a sido el ganador de un six-pack de cerveza");
                }
                case 3 -> {
                    if (nbola==3)
                        System.out.println("a sido el ganador de una camiseta");
                }
                case 4 -> {
                    if (nbola==4)
                        System.out.println("a sido el ganador de una pantaloneta");
                }
                case 5 -> {
                    if (nbola==5)
                        System.out.println("a sido el ganador de una sudadera");
                }
                case 6 -> {
                    if (nbola>=6)
                        System.out.println("No existe");
                }
            }
            System.out.println("Finaliza");
        }
        if(sexo==f)
      System.out.println("Saque el numero de bola en la canasta femenino y escribalo");
      nbola=input.nextInt();
      switch (nbola){
          case 1:
              if (nbola==1)
                        System.out.println("a sido el ganador de una locion ");
                    break;
          case 2:
              if (nbola==2)
                        System.out.println("a sido el ganador de un bikini ");
                    break;
          case 3:
                    if (nbola==3)
                        System.out.println("a sido el ganador de una crema para la cara");
                    break;
          case 4:
                    if (nbola==4)
                        System.out.println("a sido el ganador de una planca para el cabello ");
                    break;
          case 5:
                    if (nbola==5)
                        System.out.println("a sido el ganador de un esmalte de uñas");
                    break;
          case 6:
                    System.out.println("No existe");
                    break;
          default:
              System.out.println("Finaliza");
      }
    }
}