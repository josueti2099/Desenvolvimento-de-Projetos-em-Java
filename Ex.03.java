package Exercicios;
import java.util.Scanner;
//Import que vai exibir a data atual:
import java.time.LocalDate;
import java.time.Month;
public class Exercicios_3 {

	public static void main(String[] args) {
/*
Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma  mensagem. 
Ex: 
Nome do Funcionário: Maria do Carmo Salário: 1850,45 
O funcionário Maria do Carmo tem um salário de R$1850,45 em junho. 
*/
		Scanner in = new Scanner(System.in);
		System.out.println("Nome do Funcionário:");
		String nome = in.nextLine();
		System.out.println("Salário:");
		Float salario = in.nextFloat();
		
        // Obtém a data atual
        LocalDate hoje = LocalDate.now();

        // Extrai o mês e tranforma em portugues
        Month mes = hoje.getMonth();
        String mesFormatado = mes.getDisplayName(java.time.format.TextStyle.FULL, new java.util.Locale("pt", "BR"));
        System.out.println("O funcionário " + nome + " tem um salário de " + salario+ " em " +mesFormatado);
        



		

	}

}
