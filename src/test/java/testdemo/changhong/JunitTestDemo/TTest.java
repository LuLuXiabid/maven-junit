package testdemo.changhong.JunitTestDemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TTest {
	private T te=new T();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void sub() {
		assertEquals(5, te.add(5, 11));
		//fail("Not yet implemented");
	}
	@Test
	public void mul() {
		assertEquals(5, te.add(18, 9));
		//fail("Not yet implemented");
	}
	@Test
	public void add() {
		assertEquals(5, te.add(14, 11));
		//fail("Not yet implemented");
	}
	@Test
	public void div() {
		assertEquals(2, te.add(23, 11));
		//fail("Not yet implemented");
	}

}
