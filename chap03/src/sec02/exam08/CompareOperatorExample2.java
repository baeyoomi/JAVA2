package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);   //true
		
		double v4 = 0.1;
		float v5 = 0.1f; // double형으로 변환하면 (0.100000000149011612) 소수점에서 문제가 있음 , 음의보수
		System.out.println(v4 == v5);     //false
		System.out.println((float)v4 == v5);     //true
		System.out.println((int)(v4*10) == (int)(v5*10));     //true

	}

}

