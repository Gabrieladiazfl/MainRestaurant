package Controller;

import java.util.ArrayList;

import data.ClientRepository;
import models.Client;

public class ClientController {
	
	ClientRepository clientRepository = new ClientRepository();
	//crear
	public String createClient(String name, String lastName, String identificationDocument, boolean hasChild) {
		 
		if(name.trim().length() <=3) {
			return "El nombre no puede tener menos de 3 letras";
		}
		
		if (lastName.trim().length() <=4) {
			return "El apellido no puede tener menos de 4 letras";	
		}
		
		if (identificationDocument.trim().length() <=7) {
			return "El numero de identificacion no puede ser menor a 7 digitos";
		}
		if (identificationDocument.trim().length() >11) {
			return "El numero de identificacion no puede ser mayor a 11 digitos";
		}
		
		Client client = new Client(name, lastName, identificationDocument, hasChild);
		
		boolean result = clientRepository.create(client);
		
		if (result) {
			System.out.println("");
			return "El cliente se creo con exito";
		} else {
			System.out.println("");
			return "Hay un error en los datos al crear el cliente";
		}
		}
	//En listar clientes
	   public ArrayList<Client> getClients() {
		return clientRepository.getAll();
	}
	   //Buscar por id
	   public Client searchClient(String id) {
			Client client = clientRepository.findClientById(id);
			return client;
		}
	   //Actualizar por id
	   
	   public String updateClient(Client client, String name, String lastName, String identificationDocument, boolean hasChildren) {
		   Client clientUpdate = new Client(name, lastName, identificationDocument, hasChildren);
		   clientRepository.updateClient(client, clientUpdate);
		   return null;
	   
	   }
	   //Eliminar cliente por id
	   public Boolean deleteClient(String id) {
			return clientRepository.deleteClientById(id);
		}


}
