package sec02.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// Arithmetic 산술연산자
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);

		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);   //소수점 절삭됌 int형이라서
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);   // 나머지값이라서 1    //게시판 페이지 수와 나머지 갯수등 계산할때 많이 쓰임
		
		double result6 = (double) v1 / v2;
		System.out.println("result6=" + result6);   // 소수점 나타내려고 double 씀
		

	}

}
