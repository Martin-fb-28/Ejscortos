import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cara = 0;
        int cruz = 0;

        System.out.println("Cuántas veces quieres lanzar tu moneda? ");
        int tirarmoneda;
        tirarmoneda = sc.nextInt();



        for (int z = 1; z <= tirarmoneda; z++ ) {
            double numero = Math.random();
            if( numero < 0.5){
                cara++;
                System.out.println("Ha salido cara! ");
            }else {
                cruz++;
                System.out.println("Ha salido cruz! ");
            }
        }

        System.out.println("\nResultados");
        System.out.println("Caras: " + cara);
        System.out.println("Cruces: " + cruz);



























































    }
}
