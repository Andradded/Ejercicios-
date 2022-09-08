/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3p2;
import java.util.Scanner;
/**
 *
 * @author Andrade
 */
public class Ejercicio3p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0, num;
        double promedio;
        Scanner ingresar = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.println("ingresar el numero " + i);
            num = ingresar.nextInt();
            suma = suma + num; 
        }
        promedio = suma / 5;
        System.out.println("El promedio es: " + promedio);
    }
    
}
