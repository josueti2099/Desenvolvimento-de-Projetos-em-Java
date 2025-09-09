import java.util.Scanner;

public class CalculadoraVidaFumante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Digite há quantos anos você fuma: ");
        int anosFumando = scanner.nextInt();

        int totalCigarros = (cigarrosPorDia * 365) * anosFumando;

        int minutosPerdidos = totalCigarros * 10;

        int diasPerdidos = minutosPerdidos / 1440;

        System.out.println("\n--- Resultado ---");
        System.out.println("Você perderá aproximadamente " + diasPerdidos + " dias de vida.");

        scanner.close();
    }
}
