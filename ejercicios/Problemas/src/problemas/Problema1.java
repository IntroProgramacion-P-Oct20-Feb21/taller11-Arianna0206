/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        presentarNumerosPares(informacion);
    }
    
    public static void presentarNumerosPares(int[][] datos){
        String cadena = "";
        int valor;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                valor = datos[i][j];
                if(valor%2==0){
                    cadena = String.format("%s%s\t", cadena, datos[i][j]);
                }
            }
        }
        System.out.println(cadena);
    }
}


