package br.com.alura.designpatterns.impostos;

public abstract class TemplateImpostoCondicional extends Imposto {

	public TemplateImpostoCondicional() {

	}
	
	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public final double calcula(Orcamento orcamento) {

		if (this.aplicaMaximaTaxacao(orcamento)) {
			return this.maximaTaxacao(orcamento) + this.calculoOutroImposto(orcamento);
		}
		return this.minimaTaxacao(orcamento) +  this.calculoOutroImposto(orcamento);
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean aplicaMaximaTaxacao(Orcamento orcamento);

}
