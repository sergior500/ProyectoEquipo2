package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import main.java.com.model.Historial;
import main.java.com.model.PaginaWeb;

class Test {


	
	@org.junit.jupiter.api.Test
	void testAddPaginas() {
		PaginaWeb pw1 = new PaginaWeb("www.google.es", LocalDateTime.of(2020,3,2,17,20,00));
	}
	
	@org.junit.jupiter.api.Test
	void paginaMismoDiaTest() {
		List<PaginaWeb> resultado = new ArrayList();
		PaginaWeb pw1 = new PaginaWeb("www.google.es", LocalDateTime.of(2020,3,2,17,20,00));
		PaginaWeb pw2 = new PaginaWeb("www.google.es", LocalDateTime.of(2020,3,2,17,20,00));
		resultado.add(pw2);
		resultado.add(pw1);
		Historial historial = new Historial();
		
		historial.annadirAlHistorial(pw1);
		historial.annadirAlHistorial(pw2);

		historial.mostrarElementoLista(LocalDate.of(2020, 3, 2));
		
		assertTrue(historial.mostrarElementoLista(LocalDate.of(2020, 3, 2)).contains("google"));
		System.out.println(historial.mostrarElementoLista(LocalDate.of(2020, 3, 2)));
	}	
	
	@org.junit.jupiter.api.Test
	void borrarListaTest() {
		List<PaginaWeb> resultado = new ArrayList();
		Historial h1=new Historial();
		PaginaWeb pw1 = new PaginaWeb("www.google.es", LocalDateTime.of(2020,3,2,17,20,00));
		h1.annadirAlHistorial(pw1);
		h1.borrarHistorial();
	
		assertTrue(h1.getHistorial().isEmpty());

	
	}

	@org.junit.jupiter.api.Test
	void mostrarTodaListaTest() {
		PaginaWeb pw1 = new PaginaWeb("www.google.es", LocalDateTime.of(2020,3,2,17,20,00));
		PaginaWeb pw2 = new PaginaWeb("www.facebook.es", LocalDateTime.of(2020,3,2,17,20,00));
		Historial historial = new Historial();
		historial.annadirAlHistorial(pw1);
		historial.annadirAlHistorial(pw2);
		List<PaginaWeb> resultado = new ArrayList();
		resultado.add(pw2);
		resultado.add(pw1);
		
		assertEquals(historial.mostrarTodaLaLista(),resultado);
	
	}
}
