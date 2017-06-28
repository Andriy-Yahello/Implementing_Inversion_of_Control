package co.lofongi.third;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	ExStudent ex = (ExStudent)context.getBean("stud1");

	ExStudent ex2 = (ExStudent)context.getBean("stud2");
	
	System.out.println(ex.toString());
	System.out.println(ex2.toString());
	
	//context.close();
}
}
