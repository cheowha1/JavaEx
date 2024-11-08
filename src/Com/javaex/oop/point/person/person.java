package Com.javaex.oop.point.person;

public class person {
	// 필드
	protected String name;
	protected int age;
	
	// 생성자
	public person() {
		//  기본 생성자
		System.out.println("person() 생성자 호출");
	}
	public person(String name, int age) {
		this.name= name;
		this.age = age;
		System.out.println("person(String, int 생성자 호출");
	}
	
	// Getters/Setters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//  일반 메서드
	public void showInfo() {
		System.out.println("Name: " + name + " , Age: " + age);
	}
}
