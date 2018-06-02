package br.com.fsg.desafioalgoritmo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NumberGeneratorTest {

	@Rule
	public ExpectedException ex = ExpectedException.none();

	@Test
	public void deveriaRetornarErroParaNull() {
		ex.expect(IllegalArgumentException.class);
		ex.expectMessage("Não é permitido valor null");

		NumberGenerator numberGenerator = new NumberGenerator();
		numberGenerator.run(null, null);
		numberGenerator.run(null, 0);
		numberGenerator.run(0, null);
	}

	@Test
	public void deveriaRetornarConcaterDoisNumeros() {
		NumberGenerator numberGenerator = new NumberGenerator();
		Integer C = numberGenerator.run(0, 0);
		assertSame(C, 00);
	}

	@Test
	public void deveriaRetornarConcaterQuatroNumeros() {
		NumberGenerator numberGenerator = new NumberGenerator();
		Integer C = numberGenerator.run(10, 11);
		assertEquals(C, new Integer(1101));
	}

	@Test
	public void deveriaRetornarConcaterComAMaior() {
		NumberGenerator numberGenerator = new NumberGenerator();
		Integer C = numberGenerator.run(1011, 11);
		assertEquals(C, new Integer(110111));
	}

	@Test
	public void deveriaRetornarConcaterComBMaior() {
		NumberGenerator numberGenerator = new NumberGenerator();
		Integer C = numberGenerator.run(1, 1105);
		assertEquals(C, new Integer(11105));
	}

	@Test
	public void deveriaRetornarConcaterComRetornoMaiorQueLimite() {
		NumberGenerator numberGenerator = new NumberGenerator();
		Integer C = numberGenerator.run(1011, 110015);
		assertEquals(C, new Integer(-1));
	}
}
