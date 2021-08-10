package models;

public class Recipe {
	
	//Attributes
	
	private String name;
	private int price;
	private String code;
	
	//Constructor
	public Recipe (String name, int price, String code){
		this.name = name;
		this.price = price;
		this.code = code;
	}
	//Methods get(Fijar) Set(Obtener)
	
	public void setname (String name) {
		this.name =name;
	}
	  public String getname () {
		  return name;
	  }
	  public void setprice (int price) {
		  this.price =price;
	  }
	   public  int getprice () {
	    	return price;
	    }
	   public void setcode (String code) {
		   this.code = code;
	   }
	   public String getcode () {
		   return code;
	   }
	   @Override
		public String toString() {
			return "Client [Nombre: " + name + "Precio:" + price + "Codigo:" + code + "]";
		}
}
