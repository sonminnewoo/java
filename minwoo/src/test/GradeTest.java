package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

import java.io.FileWriter;
import java.io.IOException;

public class GradeTest {

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;

//	槳團辦
	String subjectFistSpell;
	String subjectName;
	int subjectId;

	
	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) throws FileNotFoundException {

		
		GradeTest test = new GradeTest();
		test.creatSubject2(); // 槳團辦
		test.createStudent();

		String report = test.gradeReport.getReport(); // 槳團辦
		System.out.println(report);
		
	        // Save the report to a text file
	        try (FileWriter writer = new FileWriter("resultInfo.txt")) {
	            writer.write(report);
	            System.out.println("Report saved to resultInfo.txt");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}

	public void creatSubject2() throws FileNotFoundException { // 槳團辦

		Scanner scanner2 = new Scanner(new FileInputStream("subjectinfo.txt"));

		while (scanner2.hasNextLine()) {

			subjectFistSpell = scanner2.next();
			subjectName = scanner2.next();
			subjectId = scanner2.nextInt();

			Subject subject = new Subject(subjectName, subjectId);

			if (subjectFistSpell.equals("K")) {
				korean = subject;
				goodSchool.addSubject(korean);
			} else if (subjectFistSpell.equals("M")) {
				math = subject;
				goodSchool.addSubject(math);

			} else if (subjectFistSpell.equals("D")) {
				dance = subject;
				dance.setGradeType(Define.AB_TYPE);
				goodSchool.addSubject(dance);

			} else {
				System.out.println("澀跤脹 高殮棲棻");
				return;
			}
//			槳團辦
		}
	}

	public void createStudent() throws FileNotFoundException {

		Scanner scanner = new Scanner(new FileInputStream("studentinfo.txt"));

		String name;
		int id;
		int koreanScore;
		int mathScore;
		int danceScore;
		int majorCode;

		Student student = null;

		while (scanner.hasNextLine()) {

			name = scanner.next();
			id = scanner.nextInt();
			koreanScore = scanner.nextInt();
			mathScore = scanner.nextInt();
			danceScore = scanner.nextInt();
			if (danceScore <= 100) {
				majorCode = scanner.nextInt();
			} else {
				majorCode = danceScore;
			}

			if (majorCode == Define.KOREAN) {
				student = new Student(id, name, korean);
			} else if (majorCode == Define.MATH) {
				student = new Student(id, name, math);
			} else if (majorCode == Define.DANCE) {
				student = new Student(id, name, dance);
			} else {
				System.out.println("澀跤脹 高殮棲棻");
				return;
			}

			goodSchool.addStudent(student);
			korean.register(student);
			math.register(student);

			addScoreForStudent(student, korean, koreanScore);
			addScoreForStudent(student, math, mathScore);
			if (danceScore <= 100) {
				addScoreForStudent(student, dance, mathScore);
				dance.register(student);
			}

		}
		scanner.close();
	}

	// 槳團辦
	public void addScoreForStudent(Student student, Subject subject, int point) {

		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);

	}
}
