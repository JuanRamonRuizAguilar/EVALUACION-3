/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_arreglos;

import static java.awt.SystemColor.menu;

/**
 *
 * @author juani
 */
public class EVA3_9_ARREGLOS {


    public static void main(String[] args) {
        String diasSemana[] = {"Domingo","Lunes", "Martes","Miercoles","Jueves","Vernes","Sabado"};
        char vocales[] = {'a','e','i','o','u'};
        System.out.println("Tamaño del arreglo diassemana = " + diasSemana.length);
        System.out.println("Tamaño de arreglo de vocales = "+ vocales.length);
        
        for (int i = 0; i < diasSemana.length; i++){
            System.out.println(diasSemana[i]);
            
    }
       for (int j = 0; j < vocales.length; j++){
           System.out.println(vocales[j]);
           
       } 
        String menu[] = {"Archivo","Nueva Factura","Modificar","Salir"};
        for (int i = 0; i < menu.length; i++){
            System.out.println(i + "-" + menu[i]);
        }
    }
}
