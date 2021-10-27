
public class Plot extends java.lang.Object{
	
	//Fields
	private int x;
	private int y;
	private int width;
	private int depth;
	
	//Constructors
	public Plot() {
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
		
	}
	
	public Plot(Plot p) {
		Plot q = new Plot();
		
		q.x = p.x;
		q.y = p.y;
		q.width = p.width;
		q.depth = p.depth;
		
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		
	}
	
	//Methods
	public boolean overlaps(Plot p) {
		boolean y;
		
		if(p.x >this.x || p.y > this.y || p.width > this.width || p.depth >this.depth){
			y = true;
		}else {
			y = false;
		}
		
		return y;
	}
	
	public boolean encompasses(Plot p) {
		boolean y;
		
		if(p.x == this.x && p.y == this.y && p.width == this.width && p.depth == this.depth) {
			y = true;
		}else {
			y = false;
		}
		
		return y;
	}
	
	public int getX() {
		int x;
		
		x = this.x;
		
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		int y;
		
		y = this.y;
		
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		int width;
		
		width = this.width;
		
		return width;
	}
	
	public int getDepth() {
		int depth;
		
		depth = this.depth;
		
		return depth;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public java.lang.String toString(){
		
		return "Upper left: (" + this.x +","+ this.y + "); " + "Width: " + this.width + " Depth: " +  this.depth;
	}

}
