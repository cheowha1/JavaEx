package Com.javaex.oop.staticmember;

// static, instance, local
public class staticEx {
    public static int refcount; // 클래스 변수
    public static String classVar; // 클래스 변수
    public String instanceVar; // 인스턴스 변수
    
    // 클래스 변수를 초기화 하는 static 블록
    static {
    	refcount = 0;  // 현재 인스턴스의 수
    	classVar = "static Member";
    	System.out.println("static Block calls");
//    	instanceVar = "InstanceVar";
    	// static 영역에서는 static 만 접근할 수 있다
    }
    
    // 생성자 : 인스턴스 생성시 초기화의 역활
    public staticEx() {
    	++refcount;
    	System.out.println("생성자 호출");
    	System.out.println("창조카운트:" + refcount );
    }
    
    // 소멸자
    @Override
    protected void finalize() throws Throwable {
    	--refcount;
    	super.finalize();
    	System.out.println("소멸자 호출");
    }
}
