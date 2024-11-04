package Com.java;

import java.util.Scanner;

// Tip : Ctrl+shift+o : Organize Import
// Tip2: Ctrl+space : 코드 자동 완성


 
//console
// 표준 입력 : stdin -> System.in
// 표준 출력 : stdout -> System.out
// 표준 에러 : stderr -> System.err
public class javex {
	
	public static void main(String[] args) {
		// TODO auto-generated method stub
//		consoleOutput();
		consoleInput();
	}
	
	
	// 콘솔 입력 예제
	public static void consoleInput( ) {
		// 표준 입력 : stdin -> System.in
		// 데이터 소스로 부터 입력을 받는 Scanner 클래스를 사용한다
		
		// java.lang 이외의 기능을 불러올 때는 import 필요
		Scanner scanner = new Scanner(System.in);
		
		// 이름과 나이를 물어봐서 출력하는 프로그램
		System.out.print("너 누구야?");
		String name = scanner.next();
		System.out.print("나이는 몇 살이야?");
		int age = scanner.nextInt();
		
		System.out.println("Welcome," + name);
		System.out.println("당신의 나이는" + age + "세입니다");
		
		// 시스템 자원은 다 쓰고 돌려줘야 한다
		scanner.close();
		
	}
	
	
	//콘솔 출력 예제
	public static void consoleOutput() {
		// print : 개형 안함
		// println : 개형 함
		// printf : 형식 지형 문자열 출력 -> String
		System.out.print("Hello");  // 개형 안함
		System.out.println("Java!"); // 개형 함
		
		// 이스케이프 문자
		System.out.println("Hello\nJava"); // \n :  
		System.out.println("Hello\tJava"); // \t:
		System.out.println("Hello, \"Java!\"");
		
		System.out.println("\\: 역슬래시"); // // -> 
		
	}

}
