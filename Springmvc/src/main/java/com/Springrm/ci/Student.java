package com.Springrm.ci;

import java.util.*;

public class Student {
	private int id;
	private String name;
	private String address;
	private List<String> course;
	private certificate certificate;
	
	
	
	public Student(int id, String name, String address, List<String> course, com.Springrm.ci.certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.course = course;
		this.certificate = certificate;
	}


	public Student(int id,String name) {
		System.out.println("int, String Constructor");
		this.id =id;
		this.name=name;
	}
	
	
	public Student(String name,int id) {
		System.out.println("String, int Constructor");
		this.id =id;
		this.name=name;
	}
	
	

	public Student( String name, String address) {
		System.out.println("String, String constructor");
		this.name = name;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", course=" + course + ", certificate="
				+ certificate + "]";
	}

	
}
