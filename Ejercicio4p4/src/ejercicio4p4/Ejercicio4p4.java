/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4p4;

/**
 *
 * @author Andrade
 */
public class Ejercicio4p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=1; i<=10;i++){
            System.out.println("********* Tabla del "+i+" *************");
            for (int j=1; j<=10;j++){
                System.out.println(i+" multiplicado por "+j+" es igual a " +i*j);    
            }
        }
    }
    
}
