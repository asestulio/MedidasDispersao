/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersao.calculos;
import java.util.List;

public class CalculosAlcance {
	public void exibirAlcanceArray(int[] numeros) {
		int maiorNumero = 0 ;
		int menorNumero = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menorNumero) {
				// Menor número
				menorNumero = numeros[i];
			}
			
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
		System.out.println("--- exibirAlcanceArray ---");
		System.out.println("Maior numero : " + maiorNumero + " | menor numero : " + menorNumero);
		System.out.println("Alcance - " + (maiorNumero - menorNumero));
	}
	
	
	public void exibirAlcanceLista(List<Integer> numeros) {
		// Cálcular - Maior número - menor
		
		int maiorNumero = 0 ;
		int menorNumero = numeros.get(0);
		
		for (Integer numero : numeros) {
			if (numero < menorNumero) {
				// Menor número
				menorNumero = numero;
			}
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		System.out.println("--- exibirAlcanceLista ---");
		System.out.println("Maior numero : " + maiorNumero + " | menor numero : " + menorNumero);
		System.out.println("Alcance - " + (maiorNumero - menorNumero));
	}
	
}
