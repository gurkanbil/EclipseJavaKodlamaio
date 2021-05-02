package oopHomework;

public class Course {
	
	int _id;
	String _courseName;
	String _courseDetail;
	String _courseTeacher;
	double _coursePrice;
	String _courseCategory;
	
	
	//constructor with signature
	public Course(int id,String courseName,String courseDetail,String courseTeacher,double coursePrice,String courseCategory) {
	
		_id=id;
		_courseName=courseName;
		_courseDetail=courseDetail;
		_courseTeacher=courseTeacher;
		_coursePrice=coursePrice;
		_courseCategory=courseCategory;
	}
	

}
