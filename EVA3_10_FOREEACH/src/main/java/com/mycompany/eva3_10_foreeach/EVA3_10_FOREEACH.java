/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_foreeach;

/**
 *
 * @author juani
 */
public class EVA3_10_FOREEACH {

    public static void main(String[] args) {
        String diasSemana[] = {"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
        for (String string : diasSemana){
        System.out.println(string);
        
    }
     int salario[] = {100,200,2500,450,3500,4000,16000};
     for (int cant : salario)
         System.out.println("$" + cant);
    }
    String mesesDelaño[] = {"enero","febrero","marzo","abril","mayo","junio","juñio","agosto","septiembre,"
    ,"octubre","noviembre","diciembre"};
    for(String string : mesesDelaño){
    System.out.println(string);
}
}

