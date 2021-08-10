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
		
		//Crear cliente
		public boolean create(Client client) {
			clients.add(client); 
			return true;
		}
		
		// En listar clientes
		public ArrayList<Client> getAll(){
			return clients;
		}
		//Buscar cliente por id
		public Client findClientById(String id) {
			
			for (int i = 0 ; i < clients.size(); i ++) {
				
				Client client = clients.get(i);
				
				if(client.getidentificationDocument().equals(id)) {
					
					return client;
				}
			}
			return null;
		}
		//Actualizar Cliente por id
		
		public boolean updateClient(Client client, Client clientUpdate) {
			int position = clients.indexOf(client);
			clients.set(position, clientUpdate);
			return true;	
		}
		//Eliminar  cliente por id
		public Boolean deleteClientById(String id) {
			for (int i = 0 ; i < clients.size(); i++) {
				Client client = clients.get(i);
				if (client.getidentificationDocument().equals(id)) {
					clients.remove(i);
					return true;
				}
			}
			return false;
		}
	}
  


