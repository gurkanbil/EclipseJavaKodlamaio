package oopHomework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# Angular", 
				"yaz�l�m geli�tirici c# angular kamp�", "Engin Demiro�", 10000,"programlama");
		Course course2 = new Course(2,"java React", 
				"yaz�l�m geli�tirici java react kamp�", "Engin Demiro�", 15000,"programlama");

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
		// kurslar�n tek tek se�ilip sepete at�lmas� durumu
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		
		// sitede birden fazla kurs se�ilip tek seferde i�lem yap�lacaksa
		//for (Course course: courses) {
		//	courseManager.addCourse(course);
		//}
		
		
			
	}

}
