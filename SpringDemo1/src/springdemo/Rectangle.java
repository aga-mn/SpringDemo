package springdemo;

public class Rectangle implements Shape{
	private Point pointA;
	private Point pointB;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	@Override
	public void draw() {
	System.out.println("Drawing rectangle");
	System.out.println("Rectangle points: (" +pointA.getX()+", "+pointA.getY()+"),("+pointB.getX()+", "+pointB.getY()+")");
	}
	
	

}
