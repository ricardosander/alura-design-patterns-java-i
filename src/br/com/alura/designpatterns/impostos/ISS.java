package br.com.alura.designpatterns.impostos;

public class ISS extends Imposto {

	public ISS() {

	}
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + this.calculoOutroImposto(orcamento);
	}
}
