package primaTemaJava;

public class ex011 {

    public static void main(String args[]) {
        int nr = 6;

        if (nr == 0) {
            System.out.println("Zero");
        } else if (nr == 1) {
            System.out.println("Unu");
        } else if (nr == 2) {
            System.out.println("Doi");
        } else if (nr == 3) {
            System.out.println("Trei");
        } else if (nr == 4) {
            System.out.println("Patru");
        } else if (nr == 5) {
            System.out.println("Cinci");
        } else if (nr == 6) {
            System.out.println("Sase");
        } else if (nr == 7) {
            System.out.println("Sapte");
        } else if (nr == 8) {
            System.out.println("Opt");
        } else if (nr == 9) {
            System.out.println("Noua");
        } else {
            System.out.println("Numar Gresit");
        }
        
         switch (nr) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Unu");
                break;
            case 2:
                System.out.println("Doi");
                break;
            case 3:
                System.out.println("Trei");
                break;
            case 4:
                System.out.println("Patru");
                break;
            case 5:
                System.out.println("Cinci");
                break;
            case 6:
                System.out.println("Sase");
                break;
            case 7:
                System.out.println("Sapte");
                break;
            case 8:
                System.out.println("Opt");
                break;
            case 9:
                System.out.println("Noua");
                break;
            default:
                System.out.println("Numar Gresit");
                break;
        }
    }
    /* CONSOLE
        run:
        Sase
        Sase
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
