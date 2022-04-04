package main.java.com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Historial {
	List<PaginaWeb> historial = new ArrayList<PaginaWeb>();
	
	public Historial() {
		
	}
	
	public List<PaginaWeb> getHistorial() {
		return historial;
	}

	public void setHistorial(List<PaginaWeb> historial) {
		this.historial = historial;
	}

	public void annadirAlHistorial(PaginaWeb pg1) {
		historial.add(pg1);
	}
	
	public void borrarHistorial() {
		historial.clear();
	}
	
	public List<PaginaWeb> mostrarTodaLaLista() {
		return historial;
	}
	
	public List<PaginaWeb> mostrarElementoLista(LocalDate fecha) {
		List<PaginaWeb> resultado = new ArrayList();
		for (int i=0;i<historial.size();i++) {
			if(historial.get(i).getFechaYhora().toLocalDate().equals(fecha)){
				resultado.add(historial.get(i));
			}

		}
		return resultado;
	}
}
