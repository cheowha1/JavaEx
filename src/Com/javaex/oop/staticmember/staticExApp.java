package Com.javaex.oop.staticmember;

public class staticExApp {

	public static void main(String[] args) {
		// 첫 번쨰 인스탠스가 생성되기 전에 클래스가 먼저 메모리에 로드
		// static 블록에서 스태틱 영역 초기화 -> 생성자 호출
		staticEx s1 = new staticEx();  // 인스탠스 생성
		System.out.println("refcount:" + staticEx.refcount);
        
		staticEx s2 = new staticEx();  // 인스탠스 생성
		System.out.println("refcount:" + staticEx.refcount);
		
		// s1 창조 헤제
		s1 = null;
        
		System.gc();    // 가비지 컬렉터 호출 -> 직접 호출은 사양하자.
		try {
			Thread.sleep(3000);  // 3초간 대기
			System.out.println("refcount" + staticEx.refcount);
		} catch(Exception e) {
			
		}
		
		// static 클래스
		System.out.println(Calc.PI);
		System.out.println(Calc.getSum(1,2, 3, 4, 5));
	}

}
