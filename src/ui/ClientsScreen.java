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
    			System.out.println("No hay clientes creados en la base de datos");
    			return;
    		}
    		
    		for (int i = 0 ; i < clients.size(); i++ ) {
    			Client client = clients.get(i);
    			System.out.println(client.toString());
    		}
    
    	}
    	//Buscar Cliente
    	public void seachClient() {
    		
    		Scanner sc = new Scanner(System.in);
    		
    		System.out.println("Ingrese un documento de identidad para buscar");
    		
    		String id = sc.nextLine();
    		
    		Client client = clientController.searchClient(id);
    		
    		if (client != null) {
    			System.out.println(client.toString());
    		} else {
    			System.out.println("No se encuenta el cliente");
    			
    		}
    		
    	}
}
