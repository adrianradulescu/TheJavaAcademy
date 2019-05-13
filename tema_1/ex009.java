package primaTemaJava;

public class ex009 {

    public static void main(String args[]) {
        int nr = 6;

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
    /* CONSOLE
        run:
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5 
        1 2 3 4 5 6 
        BUILD SUCCESSFUL (total time: 0 seconds)
    */

}
