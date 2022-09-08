/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Andrade
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        float notal, nota2, nota3, promedio;
        System.out.println("Ingrese la primera nota");
        notal = Entrada.nextInt();
        System.out.println("Ingrese la primera nota");
        nota2 = Entrada.nextFloat();
        System.out.println("Ingresa la primera nota");
        nota3 = Entrada. nextFloat();
        promedio = (notal + nota2 + nota3) / 3;
        System.out.println("El promedio es: " + promedio);
        if (promedio >= 7){
            System.out.println("Promocionado");
        }else if (promedio >= 4){
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
        
    }
    
}
