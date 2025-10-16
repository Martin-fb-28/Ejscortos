import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

System.out.println(" Dime cuánta salud tiene tu pokemon y el de tu rival");
Scanner sc = new Scanner(System.in);
boolean turnocharizard = true;


System.out.println("\nVida de tu pokemon: ");

int vidapokemon;
int defensa = 5;
vidapokemon = sc.nextInt();

System.out.println("\nVida del pokemon rival: ");

int vidapokemon2;
int defensa2 = 5;
vidapokemon2 = sc.nextInt();
sc.nextLine();

System.out.println("La vida de tu pokemon es: " + vidapokemon);
System.out.println("\nLa vida del pokemon2 es: " + vidapokemon2);

System.out.println("\nEmpieza la batalla! ");

while (vidapokemon > 0 && vidapokemon2 > 0) {
    if (turnocharizard == true) {
        int ataque = 25;
        int daño = ataque - defensa2;
        vidapokemon2 -= daño;
        System.out.println("\nCharizard ataca a squirttle ");
        System.out.println("Vida restante: " + vidapokemon2);
    }else{
        int ataque2 = 20;
        int daño2 = ataque2 - defensa;
        vidapokemon -= daño2;
        System.out.println("\nSquirttle ataca a Charizard ");
        System.out.println("Vida restante: " + vidapokemon);
    }if (vidapokemon < 0) {
        System.out.println("\nLa batalla ha acabado, Charizard ha ganado! ");
    } else if (vidapokemon2 < 0) {
        System.out.println("\nLa batalla ha terminado, Squirttle ha ganado");

    }turnocharizard = !turnocharizard;
}








    }
}
