package primaTemaJava;

public class ex012 {

    public static void main(String args[]) {
        int luna = 7;
        
        /* 
        0 - Ianuarie
        1 - Februarie
        2 - Martie
        3 - Aprilie
        4 - Mai
        5 - Iunie
        6 - Iulie
        7 - August
        8 - Septembrie
        9 - Octombrie 
        10 - Noiembrie
        11 - Decembrie
        */

        if (luna == 11 | luna == 0 | luna == 1) {
            System.out.println("Iarna");
        } else if (luna >= 2 & luna <= 4) {
            System.out.println("Primavara");
        } else if (luna >= 5 & luna <= 7) {
            System.out.println("Vara");
        } else {
            System.out.println("Toamna");
        }

        switch (luna) {
            case 0:
                System.out.println("Iarna");
                break;
            case 1:
                System.out.println("Iarna");
                break;
            case 2:
                System.out.println("Primavara");
                break;
            case 3:
                System.out.println("Primavara");
                break;
            case 4:
                System.out.println("Primavara");
                break;
            case 5:
                System.out.println("Vara");
                break;
            case 6:
                System.out.println("Vara");
                break;
            case 7:
                System.out.println("Vara");
                break;
            case 8:
                System.out.println("Toamna");
                break;
            case 9:
                System.out.println("Toamna");
                break;
            case 10:
                System.out.println("Toamna");
                break;
            case 11:
                System.out.println("Iarna");
                break;

        }
    }
    /* CONSOLE
        run:
        Vara
        Vara
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
