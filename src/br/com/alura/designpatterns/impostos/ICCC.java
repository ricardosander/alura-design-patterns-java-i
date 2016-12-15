package br.com.alura.designpatterns.impostos;

public class ICCC extends Imposto {

	public ICCC() {

	}
	
	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() < 1000.0) {
			return orcamento.getValor() * 0.05 + this.calculoOutroImposto(orcamento);
		} else if (orcamento.getValor() <= 3000.0) {
			return orcamento.getValor() * 0.07 + this.calculoOutroImposto(orcamento);
		}
		return orcamento.getValor() * 0.08 + 30 + this.calculoOutroImposto(orcamento);
	}

}
