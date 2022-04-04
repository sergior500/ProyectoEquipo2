package main.java.com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	public void annadirPagina( PaginaWeb pagina) {
		if(historial.isEmpty()){
			historial.add(pagina);         
		}else if(historial.get(historial.size()-1).getFechaYhora()!=null && pagina.getFechaYhora().isAfter(historial.get(historial.size()-1).getFechaYhora())) {
			historial.add(pagina);                     
		}else { 
			throw new HistorialException("Se ha producido una excepcion inesperada");         
			}                                              
		}
	
	public void borrarHistorial() {
		historial.clear();
	}
	
	public List<PaginaWeb> mostrarTodaLaLista() {
		return historial;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(historial);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Historial other = (Historial) obj;
		return Objects.equals(historial, other.historial);
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
