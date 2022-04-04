package main.java.com.main;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MainApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir=false;
		while(salir!=true) {
		System.out.println("Introduce la opción deseada:");
		System.out.println("1. Nueva página consultada: ");
		System.out.println("2. Consultar historial completo.");
		System.out.println("3. Consultar historial de un día.");
		System.out.println("4. Borrar historial completo.");
		System.out.println("5. Salir");
		int opcion=Integer.valueOf(sc.nextLine());
		
		if (opcion==1) {
			NuevaPaginaConsultada();
		}else if (opcion==2) {
			
		}
		else if (opcion==3) {
			
		}else if (opcion==4) {
			
		}
		else if(opcion==5) {
			salir=true;
		}
		
		
		
	}
	

	}
	public static void NuevaPaginaConsultada() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de la página: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce la fecha en la que se consultó: ");
		System.out.println("Introduce el año: ");
		int anno = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce el mes: ");
		int mes = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce el dia: ");
		int dia = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce la hora: ");
		int hora = Integer.valueOf(sc.nextLine());
		System.out.println("Introduce los minutos: ");
		int min = Integer.valueOf(sc.nextLine());
		LocalDateTime.of(anno, mes, dia, hora, min);
	}
}
