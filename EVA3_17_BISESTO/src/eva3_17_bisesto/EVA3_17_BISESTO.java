</*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_17_bisesto;



/**
 *
 * @author juani
 */
public class EVA3_17_BISESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        System.out.println("Año a evaluar: ");
        int year = captu.nextInt();
        if (esBisiesto(year))
            System.out.println("Si es año bisiesto");
        else
            System.out.println("No es año bisiesto");
    }
    public static boolean esBisisesto(int year) {
        int resi4 = year % 4;
        int resi100 = year % 100;
        int resi400 = year % 400;
        if((resi4 == 0) && ((resi100 != 0) ||(resi400 == 0)))
            return true;
        else
            return false;
        
    }

}
    

