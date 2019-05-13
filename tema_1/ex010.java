package primaTemaJava;

public class ex010 {

    public static void main(String args[]) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int sum = 0;
        int count = 0;

        int i = 0;
        while (i < a.length) {
            if (a[i] % 2 == 0 & count < 5) {
                sum = sum + a[i];
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
    /* CONSOLE
        run:
        30
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
