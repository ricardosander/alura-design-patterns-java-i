package br.com.alura.designpatterns.impostos;

import static org.junit.Assert.*;

import org.junit.Test;

public class ISSTest {

	@Test
	public void test() {
		
		Orcamento orcamento = new Orcamento(100);
		ISS iss = new ISS();
		
		assertEquals(6, iss.calcula(orcamento), 0);
	}

}
