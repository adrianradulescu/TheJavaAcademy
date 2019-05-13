package primaTemaJava;

public class ex002 {

    public static void main(String args[]) {

        int nr = 6;
        int steps = 1; // FIXME: Why we start with 1? Matlab style?

        while (nr != 1) {
            if (nr % 2 == 0) {
                nr = nr / 2;
            }
            else {
                nr = 3 * nr + 1;
            }
            steps++;
            
            // Debug
            System.out.println(nr);
        }
        System.out.println(steps);
    }
    
    /* CONSOLE
       run:
        3
        10
        5
        16
        8
        4
        2
        1
        9
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
