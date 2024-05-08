/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8;

/**
 *
 * @author juani
 */
public class EVA3_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cubo[][][][][]= new int [10][5][7][4][9];
        for (int[][][][] cubo1 : cubo) {
            for (int j = 0; j < cubo1.length; j++) {
                for (int k = 0; k < cubo1[j].length; k++) {
                    for (int l = 0; l < cubo1[j][k].length; l++) {
                        for (int m = 0; m < cubo1[j][k][l].length; m++) {
                            cubo1[j][k][l][m] = (int)(Math.random() * 100);
                        }
                    }
                }
            }
        }
        for (int[][][][] cubo1 : cubo) {
            for (int j = 0; j < cubo1.length; j++) {
                for (int k = 0; k < cubo1[j].length; k++) {
                    for (int l = 0; l < cubo1[j][k].length; l++) {
                        for (int m = 0; m < cubo1[j][k][l].length; m++) {
                            cubo1[j][k][l][m] = (int)(Math.random() * 100);
                            System.out.println("[" + cubo1[j][k][l][m] + "]");
                        }
                    }
                }
            }
        }
        
    }
    
}
    
    

