package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndexTesting {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.cube(5);
		assertEquals(125, output);
	}

}
