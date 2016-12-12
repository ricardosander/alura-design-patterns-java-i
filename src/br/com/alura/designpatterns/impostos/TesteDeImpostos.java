package br.com.alura.designpatterns.impostos;

public class TesteDeImpostos {

	public static void main(String[] args) {
		
		ISS iss = new ISS();
		ICMS icms = new ICMS();
		ICCC iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
		
		calculadora.realizaCalculo(orcamento, iss);
		calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento, iccc);
	}
}
