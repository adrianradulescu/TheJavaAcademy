package primaTemaJava;

public class ex008 {

    public static void main(String args[]) {
        int a = 2;
        int b = 3;
        int pow = a;

        for (int i = 0; i < b-1; i++) {
            pow = pow * a;
        }
        System.out.println(pow);
    }
    /* CONSOLE
        run:
        8
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
