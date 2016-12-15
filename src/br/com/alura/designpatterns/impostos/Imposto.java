package br.com.alura.designpatterns.impostos;

public abstract class Imposto {
	
	private Imposto outroImposto;

	public Imposto() {

	}
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	public abstract double calcula(Orcamento orcamento);
	
	public double calculoOutroImposto(Orcamento orcamento) {
		if (this.outroImposto == null) return 0;
		return this.outroImposto.calcula(orcamento);
	}
}
