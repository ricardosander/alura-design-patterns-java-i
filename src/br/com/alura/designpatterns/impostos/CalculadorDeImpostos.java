package br.com.alura.designpatterns.impostos;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, String imposto) {

		if ("ICMS".equals(imposto)) {

			double icms = new ICMS().calculaICMS(orcamento);
			System.out.println(icms);
		} else if ("ISS".equals(imposto)) {
			
			double iss = new ISS().calculaISS(orcamento);
			System.out.println(iss);
		}
	}
}
