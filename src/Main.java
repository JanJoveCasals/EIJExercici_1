import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    double numero;
    do {
        System.out.println("Introdueix un nombre no negatiu");
        numero = input.nextDouble();
    } while (numero < 0);
    System.out.println("El nombre no negatiu que has escrit és " + numero);
}