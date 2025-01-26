package Modularizacao;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, op;
		System.out.print("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		n2 = sc.nextInt();
		do {
			System.out.print("\n\nQual operação voce deseja fazer: \n"
					+ "1 - Soma\n"
					+ "2 - Substracao\n"
					+ "3 - Multricacao\n"
					+ "4 - Divisao\n"
					+ "5 - Trocar valores\n"
					+ "6 - Sair");
			op = sc.nextInt();
			switch (op) {
				case 1:
					System.out.println(soma(n1,n2));
					break;
				case 2:
					System.out.println(sub(n1,n2));
					break;
				case 3:
					System.out.println(mult(n1,n2));
					break;
				case 4:
					System.out.println(div(n1,n2));
					break;
				case 5:
					n1 = trocarValor();
					n2 = trocarValor();
					break;
				case 6:
					System.out.println("Finalizando");
					break;
				default:
					System.out.println("Tente novamente !");
					break;
			}
			
			
		} while (op != 6);

	}
	
	public static int soma (int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}
	
	public static int sub (int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		return result;
	}
	
	public static int mult (int num1, int num2) {
		int result = 0;
		result = num1 * num2;
		return result;
	}
	
	public static float div (int num1, int num2) {
		float result = 0;
		if (num2 != 0) {
			result = num1 / num2;
			return result;
		} else {
			System.out.print("Não é possivel dividir");
			return result;
		}
	}
	
	public static int trocarValor() {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Digite o valor: ");
		num = sc.nextInt();
		return num;
	}

}
