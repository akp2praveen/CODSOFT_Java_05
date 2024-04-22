package task_05_Std_course_register;

import java.util.ArrayList;
import java.util.List;

public class Course_db {

	private List<Course> courses;

	public Course_db() {
		this.courses = new ArrayList<>();
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public List<Course> getAllCourses() {
		return courses;
	}

	public Course findCourseByCode(String courseCode) {
		for (Course course : courses) {
			if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
				return course;
			}
		}
		return null;
	}
}

