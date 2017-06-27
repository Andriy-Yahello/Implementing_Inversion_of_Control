package co.lofongi.first;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// printIt test
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		//    type casting to class         <bean id="printIt"
		printIt pr = (printIt)context.getBean("printIt");
		
		//OR 
		//printIt pr = context.getBean(printIt.class);
		pr.PrintIt("This is it");
		
		Person pers = (Person)context.getBean("person");
		System.out.println(pers);
		context.close();
	}

}
