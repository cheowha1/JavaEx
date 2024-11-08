package Com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		//	추상 클래스를 부모로서만 존재
//		Shape s = new Shape();
		
		Ractangle r = new Ractangle(10, 20, 100, 50);
		r.draw();
		
		Circle c = new Circle(10, 10, 30);
		c.draw();
	}

}