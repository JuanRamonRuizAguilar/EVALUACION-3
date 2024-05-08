/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_metodos;

/**
 *
 * @author juani
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarMensaje("Hola mundo cruel!!!");
        mostrarMuchosMensajes("Hola!!", 5);
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public static void mostrarMuchosMensajes(String mensaje, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
                
    }
          
    }
        
    }
