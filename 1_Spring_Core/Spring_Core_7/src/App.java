import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("hello");
	      obj.getMessage();
	      context.registerShutdownHook();
	}

}
