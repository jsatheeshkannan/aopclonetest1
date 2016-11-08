package org.vmware.model;

import org.vmware.interfaces.Shape;

public class Triangle implements Shape {
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void getGroup(){
		System.out.println("get group method from triangle");
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void draw() {
		System.out.println("triangle draw method");

	}

}
