package in.ineuron.test;
import java.io.IOException;
import java.util.Date;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import in.ineuron.comp.WishMessageGenerator;



public class MainApp {

	public static void main(String[] args) {
		
//		
//		FileSystemResource resource = new FileSystemResource("src/in/ineuron/cfg/applicationContext.xml");
//		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		//Application Context:: 
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		WishMessageGenerator wishMessage = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wishMessage);
		
		System.out.println();
		
	}

}
