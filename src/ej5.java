import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = (int) (Math.random() * 10);
        int numeropropuesto = 0;
        int vecesintento = 0;

        System.out.println(" Debes adivinar un numero entre el 1 y el 10 ");


        while (numeropropuesto != numero) {
            numeropropuesto = sc.nextInt();
            if (numeropropuesto > numero) {
                System.out.println("El número que has dado es mayor ");
                vecesintento++;
            } else if (numeropropuesto < numero) {
                System.out.println("El número que has dicho es más pequeño ");
                vecesintento++;
            } else if (numeropropuesto == numero) {
                System.out.println("Enhorabuena, lo has acertado ");
            }
        }


    }
}


