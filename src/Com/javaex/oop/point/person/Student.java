package Com.javaex.oop.point.person;

public class Student extends person {
	// 필드
	private String schoolName;
	
	//생성자
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student(String) 생성자 호출");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
		System.out.println("Student(String, int String) 생성자 호출");
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName() {
		this.schoolName = schoolName;
	}
	
	@Override
	public void showInfo() {
		System.out.println("name: " + name + "Age: " + age + ", SchoolName: " + schoolName);
	}
}
