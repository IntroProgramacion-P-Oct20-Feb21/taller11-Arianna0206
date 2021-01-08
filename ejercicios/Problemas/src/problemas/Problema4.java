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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese una opción: ");
        System.out.printf("Ingrese 1 para calcular el valor de la luz: \n");
        System.out.printf("Ingrese 2 para calcular el predio del inmueble: \n");
        opcion = entrada.nextInt();
        if(opcion == 1){
            calcularValorLuz();
        }else{
            if(opcion == 2){
                calcularPredioInmueble();
            }
        }
    }
    public static void calcularValorLuz(){
        Scanner entrada = new Scanner(System.in);
        String cedula;
        String nombre;
        double precioKilovatios;
        double numeroKilovatios;
        double valor;
        System.out.println("Ingrese su nombre completo");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el precio de los kilovatios");
        precioKilovatios = entrada.nextDouble();
        System.out.println("Ingrese el número de kilovatios");
        numeroKilovatios = entrada.nextDouble();
        valor = precioKilovatios * numeroKilovatios;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de"
                + " $ %.2f\n", nombre,cedula,valor);
    } 
    
    public static void calcularPredioInmueble(){
        Scanner entrada = new Scanner(System.in);
        String cedula;
        String nombre;
        double valorInmueble;
        double valorPredio;
        System.out.println("Ingrese su nombre completo");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su número de cédula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el valor del inmueble");
        valorInmueble = entrada.nextDouble();
        valorPredio = (valorInmueble * 2)/100;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $ %.1f y tiene que pagar de predio $ %.1f\n",
                nombre,cedula,valorInmueble,valorPredio);
    }

}
