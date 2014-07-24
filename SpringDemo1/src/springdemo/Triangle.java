package springdemo;

public class Triangle implements Shape {
		
private Point pointA;
private Point pointB;
private Point pointC;

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

public Point getPointC() {
	return pointC;
}
public void setPointC(Point pointC) {
	this.pointC = pointC;
}

	@Override
public void draw(){
		System.out.println("Drawing triangle");
		System.out.println("A: "+ this.getPointA().getX()+" "+this.getPointA().getY());
		System.out.println("B: "+ this.getPointB().getX()+" "+this.getPointB().getY());
		System.out.println("C: "+ this.getPointC().getX()+" "+this.getPointC().getY());
}

}
