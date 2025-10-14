import java.util.Scanner;

public class ejsbasicos {
    public static void main(String[] args) {

        System.out.println(" ¿Cuántos bloques quieres picar? ");
        Scanner sc = new Scanner(System.in);
        int bloques = sc.nextInt();

        for (int x = 1; x <= bloques; x ++ ) {
            System.out.println(" Has picado un bloque " + x );
        }













    }
}