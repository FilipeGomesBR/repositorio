package Questao03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String texto="";
		System.out.printf("Informe a palavra para encontrar o anagrama: ");
		texto = ler.nextLine();
		
	       String[] s = Anagrama.geraAnagramas(texto);  
	          
	          
	        for(int i = 0; i<s.length; i++) {  
	            System.out.println(s[i]);  
	        }  
	        System.out.println("Encontrados "+s.length+" anagramas.");  
	    }  
}