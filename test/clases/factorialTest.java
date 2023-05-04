package clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class factorialTest {
	static int numero;
	
	@BeforeEach
	void SetUp() {
		numero = 5;
	System.out.println("Before each");
	}
	
	@Test
	void FactorialTest() throws Exception {
		assertEquals(120, factorial.calcularFactorial(5));
	}
	
	@Test
	void allTest() {
		assertAll("factorial",
				()-> assertEquals(9,  factorial.calcularFactorial(5)));
	}

}
