package org.vmware.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vmware.services.ShapeServices;

public class MainCaller {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeServices shape  = ctx.getBean("shapeservices", ShapeServices.class);
		System.out.println(shape.getCircle().getName());
	}

}
