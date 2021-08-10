package data;

import java.util.ArrayList;

import models.Recipe;
import models.Table;

public class TableRepository {
	
	//CRUD
	
	/*Create -> crear
	 * read -> leer
	 * update -> actualizar
	 * Delete -> eliminar
	 */
private ArrayList<Table> tables = new ArrayList<Table>();
	//Crear mesa
	public boolean crateTable(Table table) {
		
		tables.add(table);
		
		return true;
	}
	//En listar mesas
	public ArrayList<Table> getTables(){
		return tables;
	}
	//Encontrar mesa por numero
public Table findTableByNumber(int number) {
		
		for(int i = 0 ; i < tables.size(); i++) {
			Table table = tables.get(i);
			
			if(table.getnumber()== number) {
				return table;
			}
		}
		return null;
	}
  //Actualizar mesa por numero
   public boolean updateTable (Table table, Table tableUpdate){
	   int position = tables.indexOf(tableUpdate);
		tables.set(position, tableUpdate);
		return true;
   }
 //Eliminar mesa por numero
   public boolean deleteTableByNumber (int number) {
			for (int i = 0 ; i < tables.size(); i++) {
			Table table = tables.get(i);
				if (table.getnumber()== number){
					tables.remove(i);
					return true;
				}
			}
			return false;
		}

  

}
