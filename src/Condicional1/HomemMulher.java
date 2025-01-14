package Condicional1;

import java.util.Scanner;

public class HomemMulher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int homemNovo, homemVelho, mulherNova, mulherVelha, aux, soma, mult;
		System.out.print("Digite a idade do primeiro homem: ");
		homemNovo = sc.nextInt();
		System.out.print("Digite a idade do segundo homem: ");
		homemVelho = sc.nextInt();
		System.out.print("Digite a idade da primeira mulher: ");
		mulherNova = sc.nextInt();
		System.out.print("Digite a idade da segunda mulher: ");
		mulherVelha = sc.nextInt();
		if  (homemNovo > homemVelho) {
			aux = homemNovo;
			homemNovo = homemVelho;
			homemVelho = aux;
		}
		if (mulherNova > mulherVelha) {
			aux = mulherNova;
			mulherNova = mulherVelha;
			mulherVelha = aux;
		}
		soma = homemVelho + mulherNova;
		mult = homemNovo + mulherVelha;
		System.out.println("Homem velho + mulher nova = " + soma);
		System.out.println("Homem novo * mulher velha = " + mult);

	}

}
