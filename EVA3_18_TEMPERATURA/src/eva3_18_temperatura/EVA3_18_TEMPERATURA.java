/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_temperatura;

/**
 *
 * @author juani
 */
public class EVA3_18_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(convertirCaf(100));
    }
    public static double convertirCaf(double temp){
        double resu;
        resu = (temp * 1.5) + 32;
        return resu;
    }
}
