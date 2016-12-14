package br.com.alura.designpatterns.impostos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ICPPTest {

	@Test
	public void impostoMinimo() {

		Orcamento orcamento = new Orcamento(400);

		Imposto icpp = new ICPP();

		assertEquals(20, icpp.calcula(orcamento), 0.0001);
	}

	@Test
	public void impostoMaximo() {

		Orcamento orcamento = new Orcamento(600);

		Imposto icpp = new ICPP();
		assertEquals(42, icpp.calcula(orcamento), 0.0001);
	}

	@Test
	public void valorLimite() {

		Orcamento orcamento = new Orcamento(500);

		Imposto icpp = new ICPP();
		assertEquals(35, icpp.calcula(orcamento), 0.0001);
	}
}
