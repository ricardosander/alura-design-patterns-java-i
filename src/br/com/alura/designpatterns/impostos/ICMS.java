package br.com.alura.designpatterns.impostos;

public class ICMS extends Imposto {

	public ICMS() {

	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50 + this.calculoOutroImposto(orcamento);
	}
}
