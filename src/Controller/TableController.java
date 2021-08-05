package Controller;

import java.util.ArrayList;

import data.TableRepository;
import models.Table;

public class TableController {
	
      TableRepository tableRepocitory = new TableRepository();
	
	public String crateTable(int number , int capacity , String location){
		
		if(number< 1 ) {
			return "El numero de la mesa debe ser mayor a 0";
		}
		if(capacity <= 1 ) {
			return "La capacidad de la mesa debe ser mayor a 1";
		}
		if(location.trim().length() <= 5 ) {
			return "La ubicacion de la mesa debe tener mas de 5 caracteres";
		}
		
		Table table = new Table(number, capacity, location);
		boolean result = tableRepocitory.crateTable(table);
		
		if (result) {
			System.out.println("");
			return "La mesa se creo con exito";
		} else {
			System.out.println("");
			return "Hubo un error al crear la mesa";
		}
	}
	
	public ArrayList<Table> getAll(){
		ArrayList<Table> tables = tableRepocitory.getTables();
		return tables;
	}
  
}