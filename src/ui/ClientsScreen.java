package ui;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.ClientController;
import models.Client;

public class ClientsScreen {
	
	ClientController clientController = new ClientController();
	
	//CrearUsuario
	public void createClient() {
		
		String name;
		String lastName;
		String identificationDocument;
		boolean hasChildren;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("---CREACION DE CLIENTE---/n");
		System.out.println("Digite el nombre: ");
		name = sc.nextLine();
		System.out.println("Digite los apellidos: ");
		lastName = sc.nextLine();
		System.out.println("Digite el documento de identidad");
		identificationDocument  = sc.nextLine();
		System.out.println("El Cliente tiene hijos s/n : ");
		String hasChildString = sc.nextLine();
		if (hasChildString.toLowerCase().equals("s")){
			hasChildren = true;
		} else {
			hasChildren = false;
		}
		String result = clientController.createClient(name, lastName, identificationDocument, hasChildren);
	    System.out.println(result);
	}
	//Mostrar usuario
    	public void listClients() {
    		ArrayList<Client> clients = clientController.getClients();
    		
    		if (clients.size() == 0) {
    			System.out.println("No existen clientes");
    			return;
    		}
    		
    		for (int i = 0 ; i < clients.size(); i++ ) {
    			Client client = clients.get(i);
    			System.out.println(client.toString());
    		}
    	}
    	//Buscar Cliente
    	public void searchClient() {
    		
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.println("Ingrese documento de identidad");
    		
    		String id = sc.nextLine();
    		
    		Client client = clientController.searchClient(id);
    		
    		if (client != null) {
    			System.out.println(client.toString());
    		} else {
    			System.out.println("No existe el cliente");
    		}  		
    	}
    	
    	//Actualizar Cliente
    	public void updateClient() {
    		
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("Ingrese el id del cliente que desea actualizar"); 		
    		String id = scanner.nextLine();
    		Client client = clientController.searchClient(id);
    		if (client != null) {
    			String name;
    			String lastName;
    			String identificationDocument;
    			String phoneNumber;
    			boolean hasChildren;
    			
    			Scanner sc = new Scanner(System.in);
    			
    			System.out.println("----ACTUALIZACION DE CLIENTE----");
    			System.out.println("Escriba el nombre");
    			name = sc.nextLine();
    			System.out.println("Escriba los apellidos");
    			lastName = sc.nextLine();
    			System.out.println("Escriba el documento de identidad");
    			identificationDocument = sc.nextLine();
    			System.out.println("El cliente tiene hijos s/n : ");
    			String hasChildString = sc.nextLine();
    			
    			if (hasChildString.toLowerCase().equals("s")) {
    				hasChildren = true;
    			} else {
    				hasChildren = false;
    			}
    			
    			String result = clientController.createClient(name, lastName, identificationDocument, hasChildren);
    			System.out.println(result);
    		}
    	}
    	//Eliminar cliente por id
    	public void deleteClient() {
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("Digite el documento del cliente que desea eliminar:");
    		String id = scanner.nextLine();
    		Boolean clientDeleted = clientController.deleteClient(id);
    		if (clientDeleted) {
    			System.out.println("Se eliminó el cliente correctamente");
    		} else {
    			System.out.println("No se encontró el cliente");
    		}
    	}
}

