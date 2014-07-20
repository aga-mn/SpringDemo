package springdemo;

/*import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
*/


public class Triangle  {
	
	//implements ApplicationContextAware, BeanNameAware 
	//implements InitializingBean, DisposableBean
	
private Point pointA;
private Point pointB;
private Point pointC;
//private ApplicationContext context=null;

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

	
public void draw(){
		System.out.println("A: "+ this.getPointA().getX()+" "+this.getPointA().getY());
		System.out.println("B: "+ this.getPointB().getX()+" "+this.getPointB().getY());
		System.out.println("C: "+ this.getPointC().getX()+" "+this.getPointC().getY());
}

public void myInit(){
	System.out.println("Myinit method called for Triangle");
}

public void cleanUp(){
	System.out.println("cleanUp method called for Triangle");
}

/*@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("InitializingBean init method called for Triangle");
	
}

@Override
public void destroy() throws Exception {
	System.out.println("DisposableBean destroy method called for Triangle");
}

@Override
public void setApplicationContext(ApplicationContext context)
		throws BeansException {
	this.context=context;
}

@Override
public void setBeanName(String beanName) {
	System.out.println("Bean name is: "+ beanName);
}

*/	

}

