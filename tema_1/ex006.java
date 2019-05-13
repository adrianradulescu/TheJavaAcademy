package primaTemaJava;

public class ex006 {

    public static void main(String args[]) {
        int nr = 6;
        int i = 0;

        while (i < nr) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
    /* CONSOLE
        run:
        1
        3
        5
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
