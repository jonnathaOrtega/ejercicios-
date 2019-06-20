/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo;

/**
 *
 * @author jhonny
 */
public class Trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n tablero de damas: ");

        int contadorH = 1;
        int contadorV = 1;
        int TAMANO = 8;

        while (contadorV <= TAMANO) {
            contadorH = 1;
            while (contadorH <= TAMANO) {
                if (0 == contadorV % 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }

                contadorH++;
            }
            System.out.print("\n");
            contadorV++;
        }

    }
}


