/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Andrade
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        
        System.out.println("Escriba el primer entero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Escribe el segundo entero: ");
        numero2 = entrada.nextInt();
        
        if (numero1 == numero2)
            System.out.println("El numero " + numero1 + "es igual a " + numero2);
        
        if (numero1 != numero2)
            System.out.println("El numero " + numero1 + "es distinto a " + numero2);
        
        if(numero1 < numero2)
            System.out.println("El numero " + numero1 + "es menor a " + numero2);
        
        if (numero1 > numero2)
            System.out.println("El numero " + numero1 + "es mayor a " + numero2);
        
        if (numero1 <= numero2)
            System.out.println("El numero " + numero1 + " es menor o igual a " + numero2);
        
        if (numero1 >= numero2)
            System.out.println("El numero " + numero1 + "es mayor o igual a " + numero2);
        
            
            
            
    }
    
}
