package data;

import java.util.ArrayList;

import models.Table;

public class TableRepository {
	
	//CRUD
	
	/*Create -> crear
	 * read -> leer
	 * update -> actualizar
	 * Delete -> eliminar
	 */
private ArrayList<Table> tables = new ArrayList<Table>();
	
	public boolean crateTable(Table table) {
		
		tables.add(table);
		
		return true;
	}
	
	public ArrayList<Table> getTables(){
		return tables;
	}
	
public Table findTableById(int number) {
		
		for(int i = 0 ; i < tables.size(); i++) {
			Table table = tables.get(i);
			
			if(table.getnumber()== number) {
				return table;
			}
		}
		return null;
	}

  

}
