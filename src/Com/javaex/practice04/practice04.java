package Com.javaex.practice04;

public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		practice1();
		practice2();
//		practice3();
//		practice4();

	}
	
	private static void practice1() {
		// 문제 해결 방법: 배열의 인덱스는 0부터 시작이라서 순서가 0,1,2,3,4 로 매겨짐 길이 5짜리 배열이라면? 실제 접근할때는 배열의 0번째...배열의 1번ㅉ...~ 배열의 4번째 순서로 가는데 
		//     저기서 <= 으로 들어가면 012345 로 간다 길이는 5칸이니까. 그럼 5칸짜리 배열을 0번,1번,2번...5번 해서 횟수로는 총 6번을 반복하게되서 에러가 발생	
		int[] intArray = new int[5];
		intArray[0] =3;
		intArray[1] =7;
		intArray[2] =12;
		
		int result = 0;
		
		for ( int i =0; i < intArray.length; i++) { // 문제였던점 : i <= intArray.length; 로 되있어서 오류가 발생.
			result = result + intArray[i];
		}
		System.out.println(result);
	}
	
	private static void practice2() { // 문제 :double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하세요.
		
		double [] d = {1.2, 3.3, 6.7};
		
		
		for(int i = d.length -1; i >= 0; i = i -2) {
			System.out.print(d[i]);
		}
		
	}
	
	private static void practice3() { // 문제: 아래코드의 출력 값을 예상하고 코드로 확인해보세요. (출력하기전에 뭐가나올지 나중에다시 맞추기)
		
		int[] intA = { 3, 6, 9 };
		
		int[] intB;
		intB = intA;
		intB[0] = 20;
		intB[2] = 10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
	}
	
	private static void practice4() { // 문제 : 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로 그램을 작성하세요.
		
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		
	}

}
