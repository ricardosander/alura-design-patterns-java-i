package br.com.alura.designpatterns.descontos;

import br.com.alura.designpatterns.impostos.Orcamento;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		
		Desconto5Itens d1 = new Desconto5Itens();
		DescontoValorQuinhentos d2 = new DescontoValorQuinhentos();
		DescontoCombinacaoItem d3 = new DescontoCombinacaoItem();
		SemDesconto semDesconto = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(semDesconto);
		
		return d1.desconto(orcamento);
	}
}
