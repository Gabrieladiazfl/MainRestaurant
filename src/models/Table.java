package models;

public class Table {
	//Declarar vaiables
	
	private int number;
	private int capacity;
	private String location;
	
	//Constructor 
	public Table (int number, int capacity, String location) {
		this.number = number;
		this.capacity = capacity;
		this.location = location;			
	}
	
	//Methods set (obtener) get (fijar)
	
	public void setnumber (int number) {
		this.number = number;
	}
	  public int getnumber () {
		 return number;
	 }
	 public void setcapacity (int capacity) {
		 this.capacity = capacity;
	 }
	  public int getcapacity () {
		 return capacity;
	 }
	 public void setlocation (String location) {
		 this.location = location;
	 }
	  public String getlocation () {
		   return location;
	   }
	  
	  @Override
		public String toString() {
			return "Client [Numero: " + number + "Capacidad:" + capacity + " Ubicacion:" + location
					+"]";
		}
}

//cuando no queremos que retorne nada escribimos void 
