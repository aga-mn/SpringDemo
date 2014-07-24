package springdemo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	
//		Triangle t=new Triangle();
//		t.draw();
		
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//context.registerShutdownHook();
		Triangle t =(Triangle) context.getBean("triangle");
		t.draw();
		System.out.println("Checking commit");
		
	}
}
