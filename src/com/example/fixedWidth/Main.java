package com.example.fixedWidth;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> data = FileManager.readData("students.txt");

		ArrayList<Student> students=StudentService.listOfStudents(data);
		StudentService.printByScores(students);

	}
}
