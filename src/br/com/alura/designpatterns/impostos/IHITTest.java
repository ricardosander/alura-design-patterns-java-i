package br.com.alura.designpatterns.impostos;

import static org.junit.Assert.*;

import org.junit.Test;

public class IHITTest {

	@Test
	public void doisItensMesmoNome() {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("Item 1", 100));
		orcamento.adiciona(new Item("Item 1", 50));
		
		IHIT ihit = new IHIT();
		
		assertEquals(119.5, ihit.calcula(orcamento), 0.00001);
	}
	
	@Test
	public void variosItensDoisItensMesmoNome() {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("Item 1", 100));
		orcamento.adiciona(new Item("Item 2", 100));
		orcamento.adiciona(new Item("Item 5", 50));
		orcamento.adiciona(new Item("Item 3", 100));
		orcamento.adiciona(new Item("Item 1", 100));
		orcamento.adiciona(new Item("Item 4", 50));
		
		IHIT ihit = new IHIT();
		
		assertEquals(165, ihit.calcula(orcamento), 0.00001);
	}
	
	@Test
	public void umItem() {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("Item 1", 100));
		
		IHIT ihit = new IHIT();
		
		assertEquals(1.0, ihit.calcula(orcamento), 0.00001);
	}

	@Test
	public void doisItensNomesDiferentes() {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("Item 1", 100));
		orcamento.adiciona(new Item("Item 2", 50));
		
		IHIT ihit = new IHIT();
		
		assertEquals(3.0, ihit.calcula(orcamento), 0.00001);
	}
	
	@Test
	public void variosItensItensNomesDiferentes() {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("Item 1", 100));
		orcamento.adiciona(new Item("Item 2", 100));
		orcamento.adiciona(new Item("Item 5", 50));
		orcamento.adiciona(new Item("Item 3", 100));
		orcamento.adiciona(new Item("Item 6", 100));
		orcamento.adiciona(new Item("Item 4", 50));
		
		IHIT ihit = new IHIT();
		
		assertEquals(30, ihit.calcula(orcamento), 0.00001);
	}
}
