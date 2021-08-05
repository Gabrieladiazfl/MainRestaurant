package models;

public class Client {
	// Attributes


	private String name;
	private String lastName;
	private String identificationDocument;
	private boolean hasChildren;
	// Cuando son numeros que no se hace operaciones matematicas se pone String

	// Constructor
	public Client(String name, String lastName, String identificationDocument, boolean hasChildren) {

		this.name = name;
		this.lastName = lastName;
		this.identificationDocument = identificationDocument;
		this.hasChildren = hasChildren;

	}

	// Methods -> get(fijar) and set(Obtener)
	// TODOS los set reciben un valor, NO RETORNAN
	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;

	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setidentificationDocument(String identificationDocument) {
		this.identificationDocument = identificationDocument;
	}

	public String getidentificationDocument() {
		return identificationDocument;
	}

	public void sethasChildren(boolean hasChildren) {
		this.hasChildren = hasChildren;
	}

	public boolean gethasChildren() {
		return hasChildren;
	}
	
	@Override
	public String toString() {
		return "Client [Nombre: " + name + "Apellido:" + lastName + " Documento de identidad:" + identificationDocument
				+ "Tiene hijos: " + hasChildren + "]";
	}
}
