package br.com.fsg.desafioalgoritmo;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void testSomarTodos() {
		BinarySum binarySum = new BinarySum();
		Integer no0 = binarySum.somarProximos("0");
		assertSame(36, no0);

		Integer no1 = binarySum.somarProximos("1");
		assertSame(23, no1);

		Integer no2 = binarySum.somarProximos("2");
		assertSame(13, no2);

		Integer no3 = binarySum.somarProximos("3");
		assertSame(18, no3);

		Integer no4 = binarySum.somarProximos("4");
		assertSame(4, no4);

		Integer no5 = binarySum.somarProximos("5");
		assertSame(5, no5);

		Integer no6 = binarySum.somarProximos("6");
		assertSame(6, no6);
	}

}
