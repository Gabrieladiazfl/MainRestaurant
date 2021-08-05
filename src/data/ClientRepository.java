package data;

import java.util.ArrayList;
import models.Client;

public class ClientRepository {
//Repositoy es el unico capaz de meter a base de datos
	//CRUD
	
		/*Create -> crear
		 * read -> leer
		 * update -> actualizar
		 * Delete -> eliminar
		 */
		
		private ArrayList<Client> clients = new ArrayList<Client>();
		// Guardar muchos tipo de datos y especificar -> arraylist
		public boolean create(Client client) {
			clients.add(client); 
			
			//Una conexion a la base datos ej: Mysql
			//con una consulta SQl que inserte los datos
			return true;
		}
		public ArrayList<Client> getAll(){
			return clients;
		}
		//Encontrar cliente por id
		public Client findClientById(String id) {
			
			for (int i = 0 ; i < clients.size(); i ++) {
				
				Client client = clients.get(i);
				
				if(client.getidentificationDocument().equals(id)) {
					
					return client;
				}
			}
			
			return null;
		}
	}

