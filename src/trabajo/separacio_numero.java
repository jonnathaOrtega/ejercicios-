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
public class separacio_numero {

    public static void main(String[] args) {
        int numero;

        int quinto;
        int cuarto;
        int tercero;
        int segundo;
        int primero;

        System.out.print("Escribe un numero de 5 digitos: \n");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        quinto = numero % 10;

        numero = numero / 10;
        cuarto = numero % 10;

        numero = numero / 10;
        tercero = numero % 10;

        numero = numero / 10;
        segundo = numero % 10;

        numero = numero / 10;
        primero = numero % 10;

        System.out.printf("Los numeros separados son:");
        System.out.printf("%d  %d  %d  %d  %d  \n", primero, segundo, tercero, cuarto, quinto);

        
    }
}
