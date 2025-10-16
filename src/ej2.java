import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {

        System.out.println("Porfavor, facilitenos su saldo y el coste del refresco ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Saldo: ");
        double saldo = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Refresco: ");
       double refresco = sc2.nextDouble();


        while(saldo > 0) {
            if(saldo >= refresco) {
                saldo = saldo - refresco;
                System.out.println(" Disfrute de su refresco!, su cambio es de: " + saldo);
                System.out.println("\nCuánto costará su siguiente refresco? ");
                refresco = sc2.nextDouble();
            } else if (saldo < refresco) {
                System.out.println("Saldo insuficiente, lo siento ");
                break;
            }

        }
























    }
}
