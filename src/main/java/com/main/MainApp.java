package main.java.com.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import main.java.com.model.Historial;
import main.java.com.model.PaginaWeb;

public class MainApp {
	
public static void main(String[] args) {
			
Scanner sc = new Scanner(System.in);
Historial h1= new Historial();
boolean salir=false;
while(salir!=true) {
	System.out.println("Introduce la opción deseada:");
	System.out.println("1. Nueva pÃ¡gina consultada: ");
	System.out.println("2. Consultar historial completo.");
	System.out.println("3. Consultar historial de un dÃ­a.");
	System.out.println("4. Borrar historial completo.");
	System.out.println("5. Salir");
	int opcion=Integer.valueOf(sc.nextLine());
	
	if (opcion==1) {
		LocalDateTime fechaConsultada;
		System.out.println("Introduce el nombre de la página: ");
		String nombre = sc.nextLine();
		fechaConsultada=LocalDateTime.now();
		PaginaWeb p1= new PaginaWeb(nombre, fechaConsultada);
		h1.annadirPagina(p1);
	}else if (opcion==2) {
		System.out.println(h1.mostrarTodaLaLista());
	
	}
	else if (opcion==3) {
		LocalDate fecha;
		System.out.println("Introduce un año: ");
		int ano= Integer.valueOf(sc.nextLine());
		System.out.println("Introduce un mes: ");
		int mes= Integer.valueOf(sc.nextLine());
		System.out.println("Introduce un dia: ");
				int dia= Integer.valueOf(sc.nextLine());
				fecha= LocalDate.of(ano, mes, dia);
				System.out.println(h1.mostrarElementoLista(fecha));
			}else if (opcion==4) {
				h1.borrarHistorial();
			}
			else if(opcion==5) {
				salir=true;
			}
			
	}

}
		
}
