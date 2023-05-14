package sec01.exam01;

public class StringEqualsExampleStudy {

	public static void main(String[] args) {
		String strVar1 = "배유미";
		String strVar2 = "배유미";
		String strVar3 = "유미";
		String strVar4 = new String ("배유미");
		String strVar5 = new String ("배유미");
		String strVar6 = new String ("유미");

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		System.out.println("-------------------------");
		
		if (strVar1 == strVar3) {
			System.out.println("strVar1과 strVar3는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar3는 참조가 다름");
		}
		if(strVar1.contentEquals(strVar3)) {
			System.out.println("strVar1과 strVar3는 문자열이 같음");
		}
		System.out.println("-------------------------");
		
		if (strVar1 == strVar4) {
			System.out.println("strVar1과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar4는 참조가 다름");
		}
		if(strVar1.contentEquals(strVar4)) {
			System.out.println("strVar1과 strVar4는 문자열이 같음");
		}
		System.out.println("-------------------------");
		
		if (strVar4 == strVar5) {
			System.out.println("strVar4과 strVar5는 참조가 같음");
		} else {
			System.out.println("strVar4과 strVar5는 참조가 다름");
		}
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("strVar4과 strVar5는 문자열이 같음");
		}
		System.out.println("-------------------------");
		
		if (strVar3 == strVar6) {
			System.out.println("strVar3과 strVar6는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar6는 참조가 다름");
		}
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("strVar3과 strVar6는 문자열이 같음");
		}
		System.out.println("-------------------------");
	}

}

/* 
strVar1과 strVar2는 참조가 같음
strVar1과 strVar2는 문자열이 같음
-------------------------
strVar1과 strVar3는 참조가 다름
-------------------------
strVar1과 strVar4는 참조가 다름
strVar1과 strVar4는 문자열이 같음
-------------------------
strVar4과 strVar5는 참조가 다름
strVar4과 strVar5는 문자열이 같음
-------------------------
strVar3과 strVar6는 참조가 다름
strVar3과 strVar6는 문자열이 같음
-------------------------
*/
