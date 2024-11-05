package Com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
//		groupEx();
//		priceEx();
//		bmiEx();

	}
	
	private static void groupEx() {
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		age = scanner.nextInt();
		
		if(age > 65) {
			System.out.print("2번그룹");
			}else if(age <19) {
				System.out.print("2번그룹");
			}else {
				System.out.print("1번그룹");
			}
		System.out.print(" 입니다.");

		scanner.close();
	}
	
	private static void priceEx() {
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		age = scanner.nextInt();
		
		if(age <= 7) {
			System.out.print("취학전아동/무료 입니다.");
		}else if(age >= 8 && age <= 13) {
			System.out.print("초등학생/2000원 입니다.");
		}else if(age >= 14 && age <= 16) {
			System.out.print("중학생/3000원 입니다.");
		}else if(age >= 17 && age <= 19) {
			System.out.print("고등학생/4000원 입니다.");
		}else {
			System.out.print("성인/5000원 입니다.");
		}
		
		scanner.close();
	}
	
//	private static void bmiEx() {
//		
//	}
//	
	
}
