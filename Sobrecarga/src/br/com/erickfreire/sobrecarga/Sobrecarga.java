package br.com.erickfreire.sobrecarga;

/**
 * Programa em Java que testa sobrecarga
 * @author Erick Freire
 * @version 1 - Criado em 26-04-2021 as 22:45
 *
 */

public class Sobrecarga {

	public static void main(String[] args) {
		
		System.out.printf("O quadrado de Inteiro é de: %d%n", quadrado(7));
		System.out.printf("O quadrado de Real é de: %.2f%n", quadrado(7.5));

	}
	
	public static int quadrado(int val) {
		
		System.out.printf("A chamada do quadrado foi feita com o valor: %d%n", val);
		
		return val * val;
		
	}
	
public static double quadrado(double val) {
		
		System.out.printf("A chamada do quadrado foi feita com o valor: %.2f%n", val);
		
		return val * val;
		
	}

}
