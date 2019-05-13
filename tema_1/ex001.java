/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primaTemaJava;

/**
 *
 * @author radul
 */
public class ex001 {

    public static void main(String args[]) {
        int i = 1;
        int j = 0;

        // Print first half of string
        while (i < 5) {
            for (j = 0; j < i; j++) {
                System.out.print("#");
            }
            if( i == 4) j--;
            while (j != 0) {
                System.out.print(" ");
                j--;
            }
            i++;
        }
        
        // Print second half of string
        for (i = 3; i > 0; i--) {
            for (j = i; j > 0; j--) {
                System.out.print("#");
            }
            for (j = i-1; j > 0; j--) {
                System.out.print(" ");
            }
        }
    }
    
    /* CONSOLE
     * run:
     * # ##  ###   ####   ###  ## #BUILD SUCCESSFUL (total time: 0 seconds)
     */
}
