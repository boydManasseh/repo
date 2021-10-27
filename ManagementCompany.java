import java.util.Objects;

import javafx.scene.layout.Region;

public class ManagementCompany extends java.lang.Object{
	
	//Fields
	private java.lang.String name;
	private java.lang.String taxID;
	private Property[] properties;
	private double mgmFeePer;
	private int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	
	//Constructors
	public ManagementCompany() {
		
		
		name = "";
		taxID = "";
		
		plot = new Plot();
		
		properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		
        plot = new Plot();
		
        properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		
        plot = new Plot(x,y,width,depth);
		
        properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		ManagementCompany OC = new ManagementCompany();
		
		//
		OC.name = otherCompany.name;
		OC.taxID = otherCompany.taxID;
		OC.mgmFeePer = otherCompany.mgmFeePer;
		
		OC.plot = new Plot(otherCompany.plot);
		OC.properties = new Property[MAX_PROPERTY];
		
	}
	
	
    //Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//other methods
	public int getMAX_PROPERTY() {
		
		return MAX_PROPERTY;
	}
	
	public int addProperty(Property property) {
		int p = 0;
		boolean isFull = true;
		
		for (Property f : properties) {
			if(f == null) {
				isFull = false;
				break;
			}
		}
		if (isFull == true) {
			p = 1;
		}
		
		if (isFull == false) {
			if(Objects.isNull(property) == false) {
				p = 2;
			}else if (plot.encompasses(plot) == false) {
				p = 3;
			}else if (plot.overlaps(plot) == true) {
				p = 4;
			}else {
				for (int i = 0; i < MAX_PROPERTY; i++) {
					if (properties[i] == null) {
						properties[i] = property;
						p = i;
						break;
					}
				}
			}
		}
		
		return p;
	} 
	
	public int addProperty(String name,String city,double rent,String owner) {
		int p = 0;
		
		Property p1 = new Property(name, city, rent, owner);
		
		
        boolean isFull = true;
		
		for (Property f : properties) {
			if(f == null) {
				isFull = false;
				break;
			}
		}
		if (isFull == true) {
			p = 1;
		}
		
		if (isFull == false) {
			if(Objects.isNull(p1) == false) {
				p = 2;
			}else if (plot.encompasses(plot) == false) {
				p = 3;
			}else if (plot.overlaps(plot) == true) {
				p = 4;
			}else {
				for (int i = 0; i < MAX_PROPERTY; i++) {
					if (properties[i] == null) {
						properties[i] = p1;
						p = i;
						break;
					}
				}
			}
		}
		
		return p;
	}
	
	public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
		int p = 0;
		
        Property p1 = new Property(name, city, rent, owner);
        
        Plot plot = new Plot(x, y, width, depth);
        
		
		
        boolean isFull = true;
		
		for (Property f : properties) {
			if(f == null) {
				isFull = false;
				break;
			}
		}
		if (isFull == true) {
			p = 1;
		}
		
		if (isFull == false) {
			if(Objects.isNull(p1) == false) {
				p = 2;
			}else if (plot.encompasses(plot) == false) {
				p = 3;
			}else if (plot.overlaps(plot) == true) {
				p = 4;
			}else {
				for (int i = 0; i < MAX_PROPERTY; i++) {
					if (properties[i] == null) {
						properties[i] = p1;
						p = i;
						break;
					}
				}
			}
		}
		
		
		return p;
	}
	
	public double totalRent() {
		double totalRent = 0.0;
		
		for(Property f: properties ) {
			
			totalRent += f.getRentAmount();	
		}
		
		return totalRent;
	}
	
	public double maxRentProp() {
		double x = 0.0;
		double temp = 0.0;
        for(Property f: properties ) {
        	boolean isMax = false;
			do {
				x = f.getRentAmount();
				
				if (x > temp) {
					temp = x;
					isMax = false;
				}else {
					isMax = true;
				}
				
			}while(isMax == false);
			
		}
		
		return temp;
	}
	
	private int maxRentPropertyIndex() {
		int x = 0;
		
		for(int i = 0; i < properties.length; i++) {
			x = properties[i].getRentAmount() > properties[x].getRentAmount() ? i:x;
		}
		
		return x;
	}
	
	private double totalManagementFee() {
		double mgmFeeTotal = 0.0;
		
		for(Property f: properties) {
			mgmFeeTotal += f.getRentAmount();
		}
		mgmFeeTotal = mgmFeeTotal*mgmFeePer;
		return mgmFeeTotal;
		
	}
	
	
	
	private java.lang.String displayPropertyAtIndex(int i){
		String info;
		
		info = properties[i].toString();
		
		
		return info;
	}
	
	public java.lang.String toString(){
		
		return "List the properties for: " +this.name+ ",taxID: " +this.taxID+ "\n"+
		        "__________________________________________________________________________"+
				properties.toString() +" \n" +
		        "___________________________________________________________________________"+
				"total management Fee:" + totalManagementFee();
		
		
	}

	public Plot getPlot() {
		// TODO Auto-generated method stub
		return this.plot;
	}

	public String getName() {
		return this.name;
	}	

}
