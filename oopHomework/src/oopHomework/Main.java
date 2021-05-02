package oopHomework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# Angular", 
				"yazýlým geliþtirici c# angular kampý", "Engin Demiroð", 10000,"programlama");
		Course course2 = new Course(2,"java React", 
				"yazýlým geliþtirici java react kampý", "Engin Demiroð", 15000,"programlama");

		Course[] courses = {course1,course2};
		for (Course course: courses) {
			System.out.println(course._courseName);
		}
		
		Category category1 = new Category(1, "yapay zeka");
		Category category2 = new Category(2, "programlama");
		
		Category[] categories = {category1,category2};
		for (Category category: categories) {
			System.out.println(category._name);
		}
		
		CourseManager courseManager =new CourseManager();
		// kurslarýn tek tek seçilip sepete atýlmasý durumu
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		
		// sitede birden fazla kurs seçilip tek seferde iþlem yapýlacaksa
		//for (Course course: courses) {
		//	courseManager.addCourse(course);
		//}
		
		
			
	}

}
