public class Asteroids extends Movable{
	
	int radius
	public Asteroids(int tx, int ty, int tdx, int tdy, int tradius) {
		super(tx,ty,tdx,tdy);
		radius = tradius
	}
	
	public void setRadius(int z) radius = z;
	
	public void getRadius() return radius;

	public void notifyIfHit(){

	}

	public void getType() return 3;

	public void remove(){

	}
	
	
}