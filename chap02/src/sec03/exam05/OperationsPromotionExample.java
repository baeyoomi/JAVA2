package sec03.exam05;

public class OperationsPromotionExample {

	public static void main(String[] args) {
		// 피연산자
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + v2;   //컴파일 에러 (변수끼리 합쳐지면 범위가 승격됌(최소int단위로))
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A'+1;
		char charValue2 = 1;
		//char charValue3 = charValue1 +charValue2;   //컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드="+ intValue2);
		System.out.println("출력문자="+ (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0;     //컴파일 에러 (4.0이라는 소수점이 들어가면 int는 정수여서 에러남)
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	}

}
