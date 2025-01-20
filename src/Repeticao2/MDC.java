package Repeticao2;

import java.util.Scanner;

public class MDC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, mdc = 0;
		System.out.print("Digite o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		n2 = sc.nextInt();
		while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
		System.out.println("O mdc é = " + n1);

	}

}
