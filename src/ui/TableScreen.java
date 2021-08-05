package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.TableController;
import models.Table;

public class TableScreen {
    TableController tableController = new TableController();
	
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
	
	public void listTables() {
		ArrayList<Table> tables = tableController.getAll();
		
		if(tables.size() == 0 ) {
			System.out.println("No hay mesas creadas en la base de datos");
		}
		
		for(int i = 0 ; i < tables.size(); i ++) {
			Table table = tables.get(i);
			System.out.println(table.toString());
		}
	}
	
	public void searchTable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de la mesa para buscar");
		String tableNumber = sc.nextLine();
		
		if(tableNumber != null) {
			System.out.println(tableNumber.toString());
		} else {}
			System.out.println("No hay ninguna mesa creada");
	}





}
