package Vetores2;

import java.util.Scanner;

public class ProgressãoAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		int [] vet = new int [20];
		System.out.print("Digite o primeiro termo da P.A: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo termo da P.A: ");
		n2 = sc.nextInt();
		preencher(n1, n2, vet);
		mostrar(vet);
	}
	
	public static void preencher(int num1, int num2, int [] v) {
		int r;
		v[0] = num1;
		v[1] = num2;
		r = num2 - num1;
		for (int i = 2; i < v.length; i++) {
			v[i] = v[0] + (r * i);
		}
	}
	
	public static void mostrar (int [] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

}
