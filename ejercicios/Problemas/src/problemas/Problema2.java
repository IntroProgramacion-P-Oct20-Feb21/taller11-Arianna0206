/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese una opción: ");
        System.out.printf("Ingrese 1 para calcular el área del cuadrado: \n");
        System.out.printf("Ingrese 2 para calcular el área del triángulo: \n");
        System.out.printf("Ingrese 3 para calcular el área del rectángulo: \n");
        opcion = entrada.nextInt();
        if(opcion == 1){
            obtenerAreaCuadrado();
        }else{
            if(opcion == 2){
                obtenerAreaTriangulo();
            }else{
                if(opcion == 3){
                    obtenerAreaRectangulo();                            
                }else{
                    System.out.printf("Error, intente colocar los "
                            + "números presentados\n ");
                }
            }
        }
    }
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.printf("El área del cuadrado es: %.2f", area);
    }
    public static void obtenerAreaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de base del triángulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del triángulo");
        altura = entrada.nextDouble();
        area = (base * altura)/2;
        System.out.printf("El área del triángulo es: %.2f", area);
    }
    public static void obtenerAreaRectangulo(){
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de base del rectángulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectángulo");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El área del rectángulo es: %.2f", area);
    }
    
}
