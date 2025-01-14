package Condicional1;

import java.util.Scanner;

public class Verificarvoto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.print("Digite seu ano de nascimento: ");
		idade = sc.nextInt();
		idade = 2025 - idade;
		if (idade >= 16) {
			System.out.print("Pode votar");
		} else {
			System.out.print("Não pode votar");
		}

	}

}
