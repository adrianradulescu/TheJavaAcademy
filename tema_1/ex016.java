package primaTemaJava;

public class ex016 {

    public static void main(String args[]) {
        int nr = 123456;
        int sum = 0;
        while (nr != 0) {
            sum = sum + nr % 10;
            nr = nr / 100;
        }
        System.out.println(sum);
    }
    /* CONSOLE
        run:
        12
        BUILD SUCCESSFUL (total time: 0 seconds)
    */

}
