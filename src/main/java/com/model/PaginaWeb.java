package main.java.com.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class PaginaWeb {
	
	private String nombre;
	private String URL;
	private LocalDateTime fechaYhora;


	public PaginaWeb(String URL, LocalDateTime fechaYhora) {
		this.URL = URL;
		this.fechaYhora = fechaYhora;
	}
	public PaginaWeb(String URL, LocalDateTime fechaYhora, String nombre) {
		
		this.nombre = nombre;
		this.URL = URL;
		this.fechaYhora = fechaYhora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public LocalDateTime getFechaYhora() {
		return fechaYhora;
	}
	public void setFechaYhora(LocalDateTime fechaYhora) {
		this.fechaYhora = fechaYhora;
	}
	@Override
	public int hashCode() {
		return Objects.hash(URL, fechaYhora);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaginaWeb other = (PaginaWeb) obj;
		return Objects.equals(fechaYhora, other.fechaYhora);
	}
	@Override
	public String toString() {
		return "PaginaWeb URL:" + URL + " y Fecha Y Hora:" + fechaYhora + "\n";
	}
}
