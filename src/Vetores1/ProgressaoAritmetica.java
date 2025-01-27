package Vetores1;

import java.util.Scanner;

public class ProgressaoAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] pa = new int [20];
		int n, r;
		System.out.print("Digite o primeiro termo da P.A: ");
		n = sc.nextInt();
		System.out.print("Digite a razao dessa P.A: ");
		r = sc.nextInt();
		preencher(pa, n, r);
		mostrar(pa);
	}
	
	public static void preencher(int [] v, int num, int raz) {
		v[0] = num;
		for (int i = 1; i < v.length; i++) {
			v[i] = v[0] + (raz * i);
		}
	}
	
	public static void mostrar (int [] v) {
		for (int i = 0; i < v.length; i ++) {
			System.out.println(v[i]);
		}
	}

}
