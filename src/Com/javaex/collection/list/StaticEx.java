package Com.javaex.collection.list;

import java.util.Stack;

public class StaticEx {

	public static void main(String[] args) {
		// Static :
		// 가장 마지막에 입력된 자료가 먼저 출력된다.
		// Last Input First Output : 후입선출 자료형
		Stack<Integer> stack = new Stack<>();
		
		// 값을 10개 push(입력)
		for (int i =0; i <=10; ++i) {
			stack.push(i); // 입력
			System.out.println("STACK:" + stack);
		}
		
		// 출력 방향의 데이터 확인
		System.out.println("PEEK:" + stack.peek());   // 확인만
		System.out.println("STACK:" + stack);
		
		// 인출 : 입력 방향과 동일
		System.out.println("POP:" + stack.pop()); 	// 확인 후 인출
		System.out.println("STACK:" + stack);
		
		while(stack.empty()) {
			System.out.println("POP:" + stack.pop());
			System.out.println("STACK:" + stack);
		}
		
	}

}
