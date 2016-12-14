package br.com.alura.designpatterns.impostos;

public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {

		if (this.aplicaMaximaTaxacao(orcamento)) {
			return this.maximaTaxacao(orcamento);
		}
		return this.minimaTaxacao(orcamento);
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean aplicaMaximaTaxacao(Orcamento orcamento);

}
