package br.com.alura.designpatterns.impostos;

import static org.junit.Assert.*;

import org.junit.Test;

public class IKCVTest {

	@Test
	public void impostoMinimo() {

		Orcamento orcamento1 = new Orcamento();
		orcamento1.adiciona(new Item("Item teste", 100));
		orcamento1.adiciona(new Item("Item teste", 100));
		orcamento1.adiciona(new Item("Item teste", 100));
		orcamento1.adiciona(new Item("Item teste", 100));
		orcamento1.adiciona(new Item("Item teste", 100));
		orcamento1.adiciona(new Item("Item teste", 1));

		Orcamento orcamento2 = new Orcamento();
		orcamento2.adiciona(new Item("Item teste", 101));
		orcamento2.adiciona(new Item("Item teste", 100));
		orcamento2.adiciona(new Item("Item teste", 100));
		orcamento2.adiciona(new Item("Item teste", 100));
		
		Imposto icpp = new IKCV();

		assertEquals(30.06, icpp.calcula(orcamento1), 0.0001);
		assertEquals(24.06, icpp.calcula(orcamento2), 0.0001);
	}

	@Test
	public void impostoMaximo() {

		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("Item teste", 100));
		orcamento.adiciona(new Item("Item teste", 100));
		orcamento.adiciona(new Item("Item teste", 100));
		orcamento.adiciona(new Item("Item teste", 100));
		orcamento.adiciona(new Item("Item teste", 101));

		Imposto icpp = new IKCV();
		assertEquals(50.1, icpp.calcula(orcamento), 0.0001);
	}

	@Test
	public void valorLimite() {

		Orcamento orcamento = new Orcamento();
		orcamento.adiciona(new Item("item teste", 100));
		orcamento.adiciona(new Item("item teste", 100));
		orcamento.adiciona(new Item("item teste", 100));
		orcamento.adiciona(new Item("item teste", 100));
		orcamento.adiciona(new Item("item teste", 100));

		Imposto icpp = new IKCV();
		assertEquals(30, icpp.calcula(orcamento), 0.0001);
	}

}
