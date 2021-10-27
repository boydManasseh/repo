import javafx.scene.Scene;
import javafx.scene.layout.Region;

public class Property extends java.lang.Object{
	
	//Fields
	private java.lang.String propertyName;
	private java.lang.String city;
	private double rentAmount;
	private java.lang.String owner;
	private Plot plot;
	
	//Constructors
	public Property() {
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0.0;
		plot = new Plot();
	}
	
	public Property(Property p) {
		Property propertyCopy = new Property();
		propertyCopy.propertyName = p.propertyName;
		propertyCopy.city = p.city;
		propertyCopy.owner =p.owner;
		propertyCopy.rentAmount = p.rentAmount;
		
		plot = new Plot(p.plot);
		
	}
	
	public Property(java.lang.String propertyName,  java.lang.String city, double rentAmount,java.lang.String owner) {
		 this.propertyName = propertyName;
		 this.city = city;
		 this.owner = owner;
		 this.rentAmount = rentAmount;
		 
		 plot = new Plot(0,0,1,1);
	}
	
	public Property(java.lang.String propertyName, java.lang.String city, double rentAmount, java.lang.String owner, int x, int y, int width, int depth) {
		 this.propertyName = propertyName;
		 this.city = city;
		 this.owner = owner;
		 this.rentAmount = rentAmount;
		 
		 plot = new Plot(x,y,width,depth);
	}
	
	//Methods
	public java.lang.String getPropertyName(){
		java.lang.String x = "";
		
		x = this.propertyName;
		
		return x;
	}
	
	public void setPropertyName(java.lang.String propertyName) {
		this.propertyName = propertyName;
	}
	
	public java.lang.String getCity(){
		java.lang.String x = "";
		
		x = this.city;
		
		return x;
	}
	
	public Plot setPlot(int x, int y, int width, int depth) {
		
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		
		return plot;
	}
	
	public void setCity(java.lang.String city) {
		this.city = city;
	}
	
	public double getRentAmount() {
		double rentAmount = 0.0;
		
		rentAmount = this.rentAmount;
		
		return rentAmount;
	}
	
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public java.lang.String getOwner(){
		java.lang.String owner ="";
		
		owner = this.owner;
		
		return owner;
	}
	
	public void setOwner(java.lang.String owner) {
		this.owner =owner;
	}
	
	public java.lang.String toString(){ 
		
		return " Property Name: " +this.propertyName+ "\n" +
				"Located in " +this.city+ "\n" +
				"Belonging to: " +this.owner+ "\n" +
				"Rent Amount: "+this.rentAmount;
	}

	public Plot getPlot() {
		// TODO Auto-generated method stub
		return this.plot;
	}
	

}
