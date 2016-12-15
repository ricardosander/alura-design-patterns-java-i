package br.com.alura.designpatterns.impostos;

public class ICPP extends TemplateImpostoCondicional {

	public ICPP() {

	}
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean aplicaMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() >= 500;
	}

}
