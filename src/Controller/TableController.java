package Controller;

import java.util.ArrayList;

import data.TableRepository;
import models.Table;

public class TableController {
	
      TableRepository tableRepository = new TableRepository();
	//Crear mesa
	public String crateTable(int number , int capacity , String location){
		
		if(number < 1 ) {
			return "El numero de la mesa debe ser mayor a 0";
		}
		if(capacity <= 1 ) {
			return "La capacidad de la mesa debe ser mayor a 1";
		}
		if(location.trim().length() <= 5 ) {
			return "La ubicacion de la mesa debe tener mas de 3 caracteres";
		}
		if (location.trim().length() < 1) {
			return "Debe ingresar ubicacion de la mesa";
		}
		
		Table table = new Table(number, capacity, location);
		boolean result = tableRepository.crateTable(table);
		
		if (result) {
			System.out.println("");
			return "La mesa se creo con exito";
		} else {
			System.out.println("");
			return "Hubo un error al crear la mesa";
		}
	}
	// En listar mesas
	public ArrayList<Table> getAll(){
		ArrayList<Table> tables = tableRepository.getTables();
		return tables;
	}
	
  //Buscar mesa por numero
	public Table searchTable (int tableNumber) {
		Table table = tableRepository.findTableByNumber(tableNumber);
		return table;
	}
	
	//Actualizar mesa por numero
	
	public String updateTable (Table table, int number, int capacity, String location) {
		Table tableUpdate = new Table (number, capacity, location);
		tableRepository.updateTable(table, tableUpdate);
		return null;
		
	}
	//Eliminar mesa por numero
			public Boolean deleteTable(int number) {
				return tableRepository.deleteTableByNumber(number);
			}
	
}