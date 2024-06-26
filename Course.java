package task_05_Std_course_register;

public class Course {

	private String courseCode;
	private String title;
	private String description;
	private int capacity;
	private String schedule;
	private int enrolledStudents;

	public Course(String courseCode, String title, String description, int capacity, String schedule) {
		this.courseCode = courseCode;
		this.title = title;
		this.description = description;
		this.capacity = capacity;
		this.schedule = schedule;
		this.enrolledStudents = 0;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getSchedule() {
		return schedule;
	}

	public int getEnrolledStudents() {
		return enrolledStudents;
	}

	public boolean isFull() {
		return enrolledStudents >= capacity;
	}

	public boolean enrollStudent() {
		if (!isFull()) {
			enrolledStudents++;
			return true;
		}
		return false;
	}

	public void dropStudent() {
		if (enrolledStudents > 0) {
			enrolledStudents--;
		}
	}

	@Override
	public String toString() {
		return "Course Code: " + courseCode + "\nTitle: " + title + "\nDescription: " + description + "\nCapacity: "
				+ capacity + "\nSchedule: " + schedule + "\nEnrolled Students: " + enrolledStudents;
	}
}
