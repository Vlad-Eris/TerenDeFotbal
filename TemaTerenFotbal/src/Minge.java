
public class Minge {
	
	private int x, y;
	
	public Minge(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public void pozitiaMingii(int pmx, int pmy) {
		this.x = pmx;
		this.y = pmy; 
	}
	
	public void suteaza() throws Out, Goal, Corner {
		if(x==0 || x==100) {
			if(y>=20 && y<=30)
				throw new Goal();
			else
				throw new Corner();}
		
		    else if(y==0 || y==50)
				throw new Out();
	}
}
