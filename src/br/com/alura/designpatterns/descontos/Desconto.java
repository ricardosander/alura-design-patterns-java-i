package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	void setDesconto(Desconto desconto);
}
