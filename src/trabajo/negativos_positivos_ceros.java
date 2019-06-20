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
public class negativos_positivos_ceros {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        int num[] =new int[10];
        int neg=0, pos=0, cero=0;
        for (int i = 10; i < 10; i++) {
            System.out.println("escriba el numero"+(i+1)+" : ");
            if (num[i]<0){
                neg++;
            }
            if (num[i]>0){
                pos++;
            }
            if (num[i]==0){
                cero++;
            }
        }
        System.out.println("los positivos son"+pos);
        System.out.println("los negativos son"+neg);
        System.out.println("los veros son"+cero);

    }
}
