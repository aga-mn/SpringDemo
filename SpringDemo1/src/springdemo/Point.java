package springdemo;

public class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void cleanUp(){
		System.out.println("Cleanup called for Point");
	}

	public void myInit(){
		System.out.println("My init called for Point");
	}
}
