/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

import java.util.Scanner;

/**
 *
 * @author jhonny
 */
public class diametro {
    public static void main(String[] args) {
           int radio; 
        Scanner entrada = new Scanner( System.in );
        System.out.print( "escriba el radio : ");
        radio = entrada.nextInt();
        System.out.printf("\nEl diametro es: %d.", ( 2 * radio ) );
        System.out.printf( "\nLa circunferencia es: %f.", ( 2 * Math.PI * radio ) );
        System.out.printf( "\nEl área  es: %f.\n", ( Math.PI * radio * radio ) );
        
        
    } 
}
   
