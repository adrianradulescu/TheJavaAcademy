package primaTemaJava;

public class ex015 {

    public static void main(String args[]) {

         int n = 12;
         int m = 211;
         
        int num = n;
        int rev = 0;
        
        // https://beginnersbook.com/2014/01/java-program-to-reverse-a-number/
        while (num != 0) {
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }
        
        if (m == rev) System.out.println(true);
        else System.out.println(false);
    }
    /* CONSOLE
        run:
        false
        BUILD SUCCESSFUL (total time: 0 seconds)

    */
}
