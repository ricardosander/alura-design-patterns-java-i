package br.com.alura.designpatterns.impostos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ICCCTest {

	@Test
	public void menosDe100() {
		
		Orcamento orcamento = new Orcamento(900);
		ICCC iccc = new ICCC();
		assertEquals(45, iccc.calcula(orcamento), 0);
	}

	@Test
	public void maisDe3000() {
		
		Orcamento orcamento = new Orcamento(4000);
		ICCC iccc = new ICCC();
		assertEquals(350, iccc.calcula(orcamento), 0);
	}
	
	@Test
	public void entre1000e3000() {
		
		Orcamento orcamento = new Orcamento(2000);
		ICCC iccc = new ICCC();
		assertEquals(140, iccc.calcula(orcamento), 0);
	}
}
