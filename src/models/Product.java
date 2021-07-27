package models;

public class Product {
	
	/* Atributes:
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //CamelCase//Logica del negocio /reglas del negocio
	 */
	private String name;
	private String brand; 
    private int price;
	private int quantity; 
	
	 //Constructor -> razon: tener una forma de crear por primera vez. Crear un nuevo objeto con una estructura establecida
	public Product (String name, String brand, int price, int quantity)  {
		//No son las mismas variables declaradas, habilita crear nuevos productos con las variables ya declaradas
		
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
	
	/* Methods setters/getters -> Son las acciones que se pueden incluir 
	 * Algunos metodos: Constructor, 
	 * Set (Obtener) para poner un valor a cada producto 
	 * get (Fijar) para cambiar o retornar la variable deseada 
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setBrand (String brand){
		this.brand = brand;
		
	}
	public String getBrand () {
		return brand;
		
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice () {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int quantity () {
		return quantity;
	}
	

	
	


	
}



