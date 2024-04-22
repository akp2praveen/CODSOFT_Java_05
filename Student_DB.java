package task_05_Std_course_register;

import java.util.ArrayList;
import java.util.List;

public class Student_DB {

	private List<Student> students;

	public Student_DB() {
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public List<Student> getAllStudents() {
		return students;
	}

	public Student findStudentById(int studentId) {
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}
}
