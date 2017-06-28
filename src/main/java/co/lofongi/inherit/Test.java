package co.lofongi.inherit;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("books.xml");
		
		EBook eb = (EBook)context.getBean("ebook");
		System.out.println(eb.toString());
		
		context.close();
	}

}
