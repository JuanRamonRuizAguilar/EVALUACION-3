/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_arreglos_2;

/**
 *
 * @author juani
 */
public class EVA3_2_ARREGLOS_2 {

    public static void main(String[] args) {
        // java; 9 primer numero 
        // 8 - altimo elenmetos 
        // 0 --> TOTAL DE ELEMENTOS ALIMENTADOS EN EL ARREGLO
        
        // vamos a crear un arreglo de llenarlo de valores aleatorios
        // int datos [] x,y, --> SOLO datos de un arreglo 
        // int datos ,x,y
        int datos[] = new int [10];
        // asegurar valores aletorios entre 0 
        for(int i = 0; i < 10; i++){
            datos[i] = (int) (Math.random() * 100); // 0 - 99   
        }
        //imprimir los elementos 
        for(int i = 0; i < 10; i++){
            System.out.print("[" + datos[i] + "]");
            
        }
    }
}    