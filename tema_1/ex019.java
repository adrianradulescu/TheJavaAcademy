package primaTemaJava;

public class ex019 {

    public static void main(String args[]) {
        long cnp = 1950817380000L;
        long sumCheck = 0;

        // Nu ne intereseaza numarul alocat pe Judet si cifra de verificare
        cnp = cnp / 10000;

        sumCheck = sumCheck + cnp % 10;
        cnp = cnp / 10;
        sumCheck = sumCheck + cnp % 10 * 10;
        cnp = cnp / 10;

        switch ((int) sumCheck) {
            case 38:
                System.out.println("Judet: Vrancea");
                break;
            default:
                System.out.println("Judet: Nu este din Vrancea.");
                break;
        }

        sumCheck = 0;
        sumCheck = sumCheck + cnp % 10;
        cnp = cnp / 10;
        sumCheck = sumCheck + cnp % 10 * 10;
        cnp = cnp / 10;

        System.out.println("Nascut in ziua de: " + sumCheck);

        sumCheck = 0;
        sumCheck = sumCheck + cnp % 10;
        cnp = cnp / 10;
        sumCheck = sumCheck + cnp % 10 * 10;
        cnp = cnp / 10;

        System.out.print("In luna: ");
        switch ((int) sumCheck) {
            case 8:
                System.out.println("August");
                break;
            default:
                System.out.println("Alta decat August");
                break;
        }

        sumCheck = 0;
        sumCheck = sumCheck + cnp % 10;
        cnp = cnp / 10;
        sumCheck = sumCheck + cnp % 10 * 10;
        cnp = cnp / 10;
        System.out.println("In anul: " + sumCheck);

        System.out.print("Sex: ");
        if (cnp == 1 | cnp == 3 | cnp == 5 | cnp == 7) {
            System.out.println("Masculin");
        } else {
            System.out.println("Feminin");
        }

    }
    /* CONSOLE 
        run:
        Judet: Vrancea
        Nascut in ziua de: 17
        In luna: August
        In anul: 95
        Sex: Masculin
        BUILD SUCCESSFUL (total time: 0 seconds)
    */

}
