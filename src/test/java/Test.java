package test.java;

import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDateTime;

import main.java.com.model.PaginaWeb;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		fail("Not yet implemented");
	}
	
	@org.junit.jupiter.api.Test
	void testAddPaginas() {
		PaginaWeb pw1 = new PaginaWeb("www.google.es", LocalDateTime.of(2020,3,2,17,20,00));
	}

}
