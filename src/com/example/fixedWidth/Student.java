package com.example.fixedWidth;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String lastName;
	private float points;

	public Student(int id, String name, String lastName, float points) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.points = points;
	}

	@Override
	public String toString() {
		return id + name + lastName + points + "\n";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int c = Float.compare(o.points, this.points);
		return c;
	}

}
