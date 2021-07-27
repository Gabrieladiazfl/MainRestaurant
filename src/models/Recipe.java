package models;

public class Recipe {
	
	//Attributes
	
	private String name;
	private int price;
	
	//Constructor
	public Recipe (String name, int price){
		this.name = name;
		this.price = price;
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
}
