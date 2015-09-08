import java.lang.Math;

public class Point2D {
	public int xComponent;
	public int yComponent;
	
	
	public Point2D() {
		this(0,0);
	}

	public Point2D(int x, int y){
		this.xComponent=x;
		this.yComponent=y;		
	}	
	
	public Point2D add(int dx, int dy){
		Point2D outPutPoint = new Point2D();
		outPutPoint.xComponent = this.xComponent + dx;
		outPutPoint.yComponent = this.yComponent + dy;
		return outPutPoint;	
	}
	
	public void translate(Point2D point){
		
		this.xComponent+=point.xComponent;
		this.yComponent+=point.yComponent;
		
	}
	
	public double distance(int x, int y){
		double x1 = (double) this.xComponent;
		double dx = x1- (double) x;
		double y1 = (double) this.yComponent;
		double dy = y1- (double) y;
		double dis = Math.sqrt(dx * dx + dy* dy);
		return dis;
		
	}
	
	public String toString(){
		String coordinates = "(" + Integer.toString(this.xComponent) +","+ Integer.toString(this.yComponent)+")";
		return coordinates;
	}
	
}
