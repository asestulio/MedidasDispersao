/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispersao.calculos;

/**
 *
 * @author Túlio
 */
public class CalculosVarianciaDesvioPadrao {
  // Variância + desvio padrão
	
	// Fórmula 1 - E(u - x)² / n
	// Fórmula 2 - (E(x²) / n) - u²
	// Coeficiente de Variação - Desvio padrão / média (x 100 para apresentar a porcentagem) 
	// Teste Z - (valor - u) / DP
	
	// x => Números
	// u => Média
	// n => Quantidade de números
	
	private boolean amostragem;
	private int[] numeros;
	private float media;
	private double variancia;
	private double desvioPadrao;
	private double coeficienteVariacao;
        private float mediah;
        private float mediag;
	
	public CalculosVarianciaDesvioPadrao(int[] numeros, boolean amostragem) {
		this.numeros = numeros;
		this.amostragem = amostragem;
		calculoGeral();
	}
	
	private void calculoGeral() {
		// Calcula as funções e grava nas variáveis
		calcularMedia();
		calcularVariancia();
		calcularDesvioPadrao();
		calcularCoeficienteVariacao();
	}
	
	
	
	public void retornarSumario() {
		if (isAmostragem()) {
			System.out.println("Calculando por amostragem");
		} else {
			System.out.println("Calculando por total");
		}
		
		System.out.println("Média : " + this.media);
		System.out.println("Variância : " + this.variancia);
		System.out.println("Desvio Padrão : " + this.desvioPadrao);
		System.out.println("Coeficiente de Variação : " + this.coeficienteVariacao);
	}
	
	public void instanciarNovosNumeros(int[] numeros) {
		this.numeros = numeros;
		calculoGeral();
	}
	
	private void calcularMedia() {
		
		float somaTotal = 0;
		for (int i = 0; i < numeros.length; i++) {
			somaTotal += numeros[i];
		}
		this.media = somaTotal / numeros.length;
	}
      
	public void calcularVariancia() {
		
		float somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(media - numeros[i], 2);
		}
		
		
		double resultado;
		if (amostragem == true) {
			// Amostragem
			resultado = somaNumeros / (numeros.length - 1);
		} else {
			// Total
			resultado = somaNumeros / numeros.length;
		}
		
		this.variancia = resultado;
	}
	
	public double calcularVariancia2() {
		
		double somaNumeros = 0.0f;
		for (int i = 0; i < numeros.length; i++) {
			somaNumeros += Math.pow(numeros[i], 2);
		}
		double resultado = (somaNumeros / numeros.length) - Math.pow(media, 2);		
		return resultado;
	}
	
	public void calcularDesvioPadrao() {
		this.desvioPadrao = Math.sqrt(this.variancia);
	}
	
	public void calcularCoeficienteVariacao() {
		this.coeficienteVariacao = this.desvioPadrao / this.media;
	}
	
	
	public void calcularPorAmostragem() {
		if (!isAmostragem()) {
			this.amostragem = true;
			calculoGeral();
		}
	}
	
	public void calcularPorTotal() {
		if (isAmostragem()) {
			this.amostragem = false;
			calculoGeral();
		}
	}
	
	public double getCoeficienteVariacao() {
		return this.coeficienteVariacao;
	}
	
	public boolean isAmostragem() {
		return amostragem;
	}

	public float getMedia() {
		return media;
	}

	public double getVariancia() {
		return variancia;
	}

	public double getDesvioPadrao() {
		return desvioPadrao;
	}

	
} 

