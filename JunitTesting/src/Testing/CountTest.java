package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countS("Springbean");
		assertEquals(1, output);
	}

}
