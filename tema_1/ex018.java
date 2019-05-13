package primaTemaJava;

public class ex018 {

    public static void main(String args[]) {
        char liter = 'G';
        
         switch (liter) {
            case 'N':
                System.out.println("Nord");
                break;
            case 'S':
                System.out.println("Sud");
                break;
            case 'E':
                System.out.println("Est");
                break;
            case 'V':
                System.out.println("Vest");
                break;
            default:
                System.out.println("Te-ai ratacit?");
                break;
        }
    }
    /* CONSOLE
        run:
        Te-ai ratacit?
        BUILD SUCCESSFUL (total time: 0 seconds)
    */
}
