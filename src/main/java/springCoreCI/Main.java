package springCoreCI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springCoreCI/CIconfig.xml");
	Person p=context.getBean(Person.class,"person");
	System.out.println(p);
	}

}
