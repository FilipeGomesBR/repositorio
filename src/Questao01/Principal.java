package Questao01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		EscadaAsterisco escada = new EscadaAsterisco();
		int n = 0;
		System.out.printf("Informe o tamanho da escada:\n");
		n = ler.nextInt();
		System.out.println();
		escada.escada(n);

	}
}