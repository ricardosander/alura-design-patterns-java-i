package br.com.alura.designpatterns.descontos;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.alura.designpatterns.impostos.Item;
import br.com.alura.designpatterns.impostos.Orcamento;

public class DescontoCombinacaoItemTest {


	@Test
	public void maisDe5Itens() {
		
		Desconto desconto = new DescontoCombinacaoItem();
		
		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("Item 1", 1));
		orcamento.adiciona(new Item("Item 2", 2));
		orcamento.adiciona(new Item("Item 3", 3));
		orcamento.adiciona(new Item("Item 4", 4));
		orcamento.adiciona(new Item("Item 5", 5));
		orcamento.adiciona(new Item("Item 6", 6));
		
		assertEquals(0.0, desconto.desconto(orcamento), 0);
	}

	@Test
	public void valorMaisDe500() {
		
		Desconto desconto = new DescontoCombinacaoItem();
		
		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("Item 1", 501));
		assertEquals(0.0, desconto.desconto(orcamento), 0);
	}
	
	@Test
	public void semItens() {
		
		Desconto desconto = new DescontoCombinacaoItem();
		
		Orcamento orcamento = new Orcamento();
		assertEquals(0.0, desconto.desconto(orcamento), 0);
	}

	@Test
	public void itensCombinados() {
		
		Desconto desconto = new DescontoCombinacaoItem();
		
		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("caneta", 10));
		orcamento.adiciona(new Item("Item 3", 10));
		orcamento.adiciona(new Item("Item 4", 10));
		orcamento.adiciona(new Item("lapis", 10));
		orcamento.adiciona(new Item("Item 6", 10));
		
		assertEquals(2.5, desconto.desconto(orcamento), 0);
	}
}
