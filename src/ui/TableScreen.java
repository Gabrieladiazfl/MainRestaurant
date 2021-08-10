package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.TableController;
import models.Table;

public class TableScreen {
    TableController tableController = new TableController();
	//Crear mesa
	public void crateTable() {
		
	int number;
	int capacity;
	String location;
	
	Scanner sc = new Scanner(System.in);
		
	 System.out.println("");
	 System.out.println("----------------CREAR MESA----------------");
	 System.out.println("");
	
	 System.out.println("Ingrese el numero de la mesa: ");
	 number = Integer.parseInt(sc.nextLine());
	 System.out.println("Ingrese la capicidad de personas que tiene la mesa: ");
	 capacity = Integer.parseInt(sc.nextLine());
	 System.out.println("Ingrese la ubicacion de la mesa: ");
	 location = sc.nextLine();
	
	
	 String result = tableController.crateTable(number, capacity, location);
	 System.out.println(result);
	
	}
	// En listar mesas
	public void listTables() {
		ArrayList<Table> tables = tableController.getAll();
		
		if(tables.size() == 0 ) {
			System.out.println("No existen mesas");
		}
		
		for(int i = 0 ; i < tables.size(); i ++) {
			Table table = tables.get(i);
			System.out.println(table.toString());
		}
	}
	//Buscar mesas
	public void searchTable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de la mesa para buscar");
		String tableNumber = sc.nextLine();
		
		if(tableNumber != null) {
			System.out.println(tableNumber.toString());
		} else {}
			System.out.println("No existen mesas");
	}
	//Actualizar mesas por numero
	public void updateTable () {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escriba el numero de la mesa que desea actualizar");
		String tableNumber = sc.nextLine(); //por que aca no va parseInt?????
	}

	
	//Eliminar mesa por numero
			public void deleteTable() {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Digite el numero de la mesa que desea eliminar:");
				int number = Integer.parseInt(scanner.nextLine());
				Boolean tableDeleted = tableController.deleteTable(number);
				if (tableDeleted) {
					System.out.println("Se eliminó la mesa");
				} else {
					System.out.println("No se encontró la mesa");
				}
}
}
