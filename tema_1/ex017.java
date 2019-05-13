package primaTemaJava;

public class ex017 {

    public static void main(String args[]) {
        int nr = 123456;

        int nrEven = nr;
        int sumEven = 0;
        while (nrEven != 0) {
            sumEven = sumEven + nrEven % 10;
            nrEven = nrEven / 100;
        }

        int nrOdd = nr / 10;
        int sumOdd = 0;
        while (nrOdd != 0) {
            sumOdd = sumOdd + nrOdd % 10;
            nrOdd = nrOdd / 100;
        }

        int m = sumEven - sumOdd;
        System.out.println(m);
    }
    /* CONSOLE
        run:
        3
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
