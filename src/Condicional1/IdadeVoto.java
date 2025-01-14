package Condicional1;

import java.util.Scanner;

public class IdadeVoto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		if (idade < 16) {
			System.out.print("Não pode votar !");
		} else {
			if ((idade >= 16) && (idade < 18) || (idade > 65)) {
				System.out.print("Voto facultativo");
			} else {
				System.out.print("Voto obrigatorio");
			}
		}

	}

}
