package com.example.fixedWidth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentService {
	public static Student createStudentObjectFromString(String data) {
//		System.out.println("size od string vo crateObject "+data.length());
		return new Student(Integer.parseInt(data.substring(0, 5)), data.substring(5, 15), data.substring(15, 30),
				ConvertNumber.toTwoDecimalPlaces(data.substring(30, 35)));
	}

	public static ArrayList<Student> listOfStudents(ArrayList<String> data) {
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < data.size(); i++) {
			students.add(createStudentObjectFromString(data.get(i)));
		}
		return (ArrayList<Student>) students;

	}

	public static void printByScores(ArrayList<Student> students) {
//		ArrayList<Student> students=StudentService.listOfStudents(data);
		Collections.sort(students);
		System.out.print(students);
	}
}
