package br.com.alura.designpatterns.impostos;

public class ICMS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
