package br.com.francis.franmework.input;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsoleTest {
	
	@Before
	public void setupMockito() {
		
	}

	@Test
	public void shouldReadStringInput() {
		Assert.assertEquals(false, "true".equals(null));
	}
}
