package opOdev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1 =new Course(1,"Java","Engin","This course will provide ...");
		
		Course course2 =new Course(2,"Python","Engin","This course will provide ...");
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			
			System.out.println("Course ID"+" "+ course.id);
			System.out.println("Course Name"+" "+course.name);
			System.out.println("Instructor"+" "+course.instructor);
			System.out.println(course.detail);
			
			CourseManager courseManager = new CourseManager();
			courseManager.addThisCourse(course1);
			courseManager.addThisCourse(course2);
		}
	}

}
