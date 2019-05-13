package primaTemaJava;

public class ex003 {

    public static void main(String args[]) {
        int[] a = new int[]{33, 3, 4, 5};
        int maxOdd = 0;
        int i = 0;
        while (i != a.length) {
            if (a[i] % 2 >= maxOdd) {
                maxOdd = a[i];
            }
            i++;
        }
        if (maxOdd == 0) {
            System.out.println("NO");
        } else {
            System.out.println(maxOdd);
        }
    }
    
    /* CONSOLE
        run:
        33
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
