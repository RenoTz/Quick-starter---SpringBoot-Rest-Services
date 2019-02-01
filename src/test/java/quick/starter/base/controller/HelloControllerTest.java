package quick.starter.base.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {

	@InjectMocks
	private HelloController controller;

	@Test
	public void testFake() throws Exception {

		assertTrue(true);
	}
}
