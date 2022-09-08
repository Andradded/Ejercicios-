/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7p2;

/**
 *
 * @author Andrade
 */
public class Ejercicio7p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        for (int i =0; i <= 10000; i++)
        {
            if(i % 20 == 0)
            {
                contador++;
            }    
        }
        
        System.out.println(contador);
    }
    
}
