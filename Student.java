package task_05_Std_course_register;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private List<Course> registeredCourses;

	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		this.registeredCourses = new ArrayList<>();
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public List<Course> getRegisteredCourses() {
		return registeredCourses;
	}

	public void registerCourse(Course course) {
		if (!registeredCourses.contains(course) && !course.isFull()) {
			registeredCourses.add(course);
			course.enrollStudent();
		}
	}

	public void dropCourse(Course course) {
		if (registeredCourses.contains(course)) {
			registeredCourses.remove(course);
			course.dropStudent();
		}
	}

	@Override
	public String toString() {
		
		return "\nStudent ID: " + studentId + "\nName: " + name + "\nRegistered Courses: " + registeredCourses.size();
	}
}

 