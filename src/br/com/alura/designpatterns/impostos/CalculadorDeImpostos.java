package br.com.alura.designpatterns.impostos;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, String imposto) {

		if ("ICMS".equals(imposto)) {

			double icms = orcamento.getValor() * 0.1;
			System.out.println(icms);
		} else if ("ISS".equals(imposto)) {
			
			double iss = orcamento.getValor() * 0.06;
			System.out.println(iss);
		}
	}
}
