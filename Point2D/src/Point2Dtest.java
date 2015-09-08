import junit.framework.TestCase;
import org.junit.Assert.*;
//Test

public class Point2Dtest extends TestCase {
	 
	  public void testAdd() {
	   
	    
	    
	    Point2D p1 = new Point2D();
	    Point2D p2 = p1.add(3, 5);
	    assertEquals("p2.xComponent = 3", 3, p2.xComponent);
	    assertEquals("p2.yComponent = 5", 5, p2.yComponent);
	
	    
	    
	  }
	  
	  public void testTranslate() {

		  Point2D p1 = new Point2D();
		  Point2D p2 = new Point2D(2,3);
		  p1.translate(p2);
		  assertEquals("p1.xComponent = 2", 2, p1.xComponent);
		  assertEquals("p1.yComponent = 3", 3, p1.yComponent);

	  }
	
	  public void testDistance() {
		  Point2D p1 = new Point2D(3,4);
		  double dis = p1.distance(0,0);
		  assertEquals("dis=5.0",5.0,dis);
	  }
	  
	  
	  public void testToString(){
		  Point2D p1 = new Point2D(1,1);
		  String str = "(1,1)";
		  assertEquals("String should read (1,1)", str, p1.toString());
		  
	  }
}
	  
	  
	  
	  
	  
	  
	  
	 