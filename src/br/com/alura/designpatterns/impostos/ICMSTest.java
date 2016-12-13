package br.com.alura.designpatterns.impostos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ICMSTest {

	@Test
	public void test() {
		
		Orcamento orcamento = new Orcamento(100);
		ICMS icms = new ICMS();
		assertEquals(55, icms.calcula(orcamento), 0);
	}

}
