package primaTemaJava;

public class ex004 {

    public static void main(String args[]) {
        int[] a = new int[]{33, 3, 4, 5};
        int i = 0;

        int odd = 0;
        int even = 0;

        while (i != a.length) {
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            i++;
        }
        
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
    
    /* CONSOLE
        run:
        Even: 1
        Odd: 3
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
