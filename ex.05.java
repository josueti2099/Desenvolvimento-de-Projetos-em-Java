package Exercicios;
import java.util.Scanner;
public class Exercicios_5 {
/*5 - Faça um programa em Java que leia as duas notas de um aluno em uma matéria e
mostre na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nota 1: ");
		float nota1 = in.nextFloat();
		System.out.println("Nota 2: ");
		float nota2 = in.nextFloat();
		float media = (nota1+nota2)/2;
		System.out.println("A média entre "+nota1+ " e " + nota2+ " é igual a " +media);





	}

}
