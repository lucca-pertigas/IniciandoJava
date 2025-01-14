package Condicional1;

import java.util.Scanner;

public class DivisivelOuNao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2; 
		float result;
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		if (n2 != 0) {
			result = n1 / n2;
			System.out.print("Resultado = " + result);
		} else {
			System.out.print("Não pode dividir");
		}

	}

}
