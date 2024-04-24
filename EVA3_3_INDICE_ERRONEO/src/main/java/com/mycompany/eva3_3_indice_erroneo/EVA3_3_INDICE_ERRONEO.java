/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_indice_erroneo;

/**
 *
 * @author juani
 */
public class EVA3_3_INDICE_ERRONEO {

    public static void main(String[] args) {
        int datos [] = new int[0];
        datos [10] = 100; // error en tiempo de ejecucion  ; el indice 10 
        System.out.println("El valor en datos [10] = " + datos[10]);
        
    }
}
