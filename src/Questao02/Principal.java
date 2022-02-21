package Questao02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		SenhaForte senha = new SenhaForte();
		String texto="";
		System.out.printf("Informe sua senha:\n");
		texto = ler.nextLine();
		System.out.println();
		senha.validaPassword(texto);
		
	}
}