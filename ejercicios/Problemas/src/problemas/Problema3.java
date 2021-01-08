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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        String mensajeFinal= "";
        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la cuarta nota: ");
        nota4 = entrada.nextDouble();
        obtenerPromedio(nota1, nota2, nota3, nota4);
        mensajeFinal = obtenerPromedio(nota1, nota2, nota3, nota4);
        System.out.printf(mensajeFinal);
   
    }
    public static String obtenerPromedio(double a,double b,double c,double d){
        
        String cadena = "";
        double suma = 0;
        double promedio;
        suma = a + b + c + d;
        promedio = suma/4;
        if(promedio > 0 && promedio < 5){
            cadena = String.format("%sEl promedio de las notas: "
                    + "%.1f, %.1f, %.1f, %.1f"
                    + " es Regular\n",cadena, a,b,c,d);
        }else{
            if(promedio > 5.1 && promedio < 8){
                cadena = String.format("%sEl promedio de las notas: "
                        + "%.1f, %.1f, %.1f, %.1f"
                        + " es Bueno\n",cadena, a,b,c,d);
            }else{
                if(promedio > 8.1 && promedio < 9){
                cadena = String.format("%sEl promedio de las notas:"
                        + " %.1f, %.1f, %.1f, %.1f"
                        + " es Muy Bueno\n",cadena, a,b,c,d);
            }else{
                    if(promedio > 9.1 && promedio < 10){
                cadena = String.format("%sEl promedio de las notas:"
                        + " %.1f, %.1f, %.1f, %.1f"
                    + " es Sobresaliente\n",cadena, a,b,c,d);
                    }
                }
            }
        }
     return cadena;  
    }
}
 
        
