package springdemo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Shape s = (Shape)context.getBean("circle");
		s.draw();
		
		
	}
}
