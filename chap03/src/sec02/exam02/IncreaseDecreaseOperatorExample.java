package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 부호/증감 연산자
		// Increase 증감, 선행 증가 , 후행 증가 , 반복문(for문)
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++;           // 10 + (1)                 //연산식이 없이 변수 단독으로 증감연산자가 사용되면 앞뒤 어디에 붙어도 결과가 동일하다
		++x;           // (1) + 11 상위 x의 값이 대입된다
		System.out.println("x=" + x);          // x=12

		System.out.println("--------------------");
		y--;           // 10 - (1)
		--y;           // (1)- 9    상위 y의 값이 대입된다
		System.out.println("y=" + y);          // y=8
		
		System.out.println("--------------------");
		z = x++;      // z=12(x)  "="  12(x)+(1)  //상위x값이 증감됐다
		System.out.println("z=" + z);          // z=12    12+1이 되는것이 아니라 연산식이기 때문에 ++이 제외됐다 (z=x) = ++ 허용안됌 
		System.out.println("x=" + x);          // x=13    z로 계산이 끝나기전 x 값을 구하기 때문에 x(12)+(1)=13 값을 산출했다

		System.out.println("--------------------");
		z = ++x;      // 12 = 1+13 
		System.out.println("z=" + z);         // z=14
		System.out.println("x=" + x);         // x=14

		System.out.println("--------------------");
		z = ++x + y++;     // z = 15 + 8 , ++x = 15 , y++ = 9
		System.out.println("z=" + z);         // z=23
		System.out.println("x=" + x);         // x=15
		System.out.println("y=" + y);         // y=9
	}

}

// ++피연산자, --피연산자  = 피연산자의 값을 1 증가시키거나 1 감소 시킨다.
// 피연산자++, 피연산자-- = 다른 연산을 수행한 후에 피연산자의 값을 1증가 또는 감소시킴
