/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5p3;
import java.util.Scanner;
/**
 *
 * @author Andrade
 */
public class Ejercicio5p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int valor;
        do {
            System.out.println("Ingrese un valor entre 0 y 99 (0 finaliza):");
            valor=datos.nextInt();
            if (valor>=100) {
                System.out.println("Es de 3 digitos");
            } else {
                if (valor>=10){
                    System.out.println("Es de 2 digitos.");
                } else {
                    System.out.println("Es de 1 digito.");
                }
            }
        } while (valor!=0);
    }
    
}
