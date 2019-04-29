/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrenador;

/**
 *
 * @author maxim
 */
public class laboratorio2 {
    public static void main (String[]args){
        entrenador entrenador1 = new entrenador();
        entrenador1.setEntrenador("fransisco","tennis");
        entrenador1.entrenamiento();
        System.out.println("la variable entrenador1: "+entrenador1);
        
        entrenador entrenador2 =new entrenador();
        entrenador2.setEntrenador("Maxi", "paddle");
        entrenador2.entrenamiento();
        System.out.println("La variable entrenador2:"+entrenador2);
    }
    
}
