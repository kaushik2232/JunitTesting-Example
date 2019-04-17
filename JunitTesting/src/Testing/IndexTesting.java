package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IndexTesting {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.BMI(6.1, 80.3 );
	}

}
