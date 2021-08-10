package ui;

import java.util.Scanner;

public class MenuScreen {
	
	public int showMenuOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Seleccione la opcion que desea ralizar");
		System.out.println("--------------------");
		System.out.println("1.Crear Cliente");
		System.out.println("2.Listar Cliente");
		System.out.println("3.Buscar Cliente por id");
		System.out.println("4.Actualizar Cliente por id");
		System.out.println("5.Eliminar Cliente por id");
		System.out.println("--------------------");
		System.out.println("6.Crear Producto");
		System.out.println("7.Listar Producto");
		System.out.println("8.Buscar Producto por codigo");
		System.out.println("9.Actualizar producto por codigo");
		System.out.println("10.Eliminar producto por codigo");
		System.out.println("--------------------");
		System.out.println("11.Crear Receta");
		System.out.println("12.Listar Receta");
		System.out.println("13.Buscar Receta por codigo");
		System.out.println("14.Actualizar Receta por codigo");
		System.out.println("15.Eliminar Receta por codigo");
		System.out.println("--------------------");
		System.out.println("16.Crear Mesa");
		System.out.println("17.Listar Mesa");
		System.out.println("18.Buscar Mesa por numero");
		System.out.println("19.Actualizar mesa por numero");
		System.out.println("20.Eliminar mesa por numero");
		System.out.println("--------------------");
	
		
		try {
			int optionSelected = Integer.parseInt(sc.nextLine());
			return optionSelected;
		}catch(Exception e ) {
			return -1;
		}
		
		
	}
}
