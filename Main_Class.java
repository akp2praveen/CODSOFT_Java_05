package task_05_Std_course_register;

public class Main_Class {

    public static void main(String[] args) {
       
        Course_db courseDatabase = new Course_db();

        
        Course c1 = new Course("CSCI101", "Introduction to Programming", "Learn basic programming concepts", 30, "Mon/Wed/Fri 10:00 AM");
        Course c2 = new Course("MATH201", "Calculus I", "Introductory calculus course", 25, "Tue/Thu 2:00 PM");
        courseDatabase.addCourse(c1);
        courseDatabase.addCourse(c2);

        
        Student_DB studentDatabase = new Student_DB();

       
        Student s1 = new Student(101, "Praveen");
        Student s2 = new Student(102, "Praba");
        
        studentDatabase.addStudent(s1);
        studentDatabase.addStudent(s2);

        
        s1.registerCourse(c1);
        s1.registerCourse(c2);
        s2.registerCourse(c1);

        System.out.println("   *** Student Details *** ");
       
        System.out.println(s1);
        System.out.println(s2);

        
        System.out.println("\nCourses:\n");
        for (Course course : courseDatabase.getAllCourses()) {
            System.out.println("\n" + course);
            System.out.println("\n-----------------------");
        }
    }
}


