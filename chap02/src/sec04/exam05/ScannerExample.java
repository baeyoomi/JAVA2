package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	//키보드 입력 데이터를 변수에 저장
	public static void main(String[] args) {
		// ctrl + shift + o = 클래스 인식 안되서 에러로 인식되면 import로 파일 찾아줌(매우 간편~)
		@SuppressWarnings("resource")
		//오류 잡혀서 resource 넣음
		Scanner scanner = new Scanner(System.in);
		String inputData;
		// 클래스는 연산자가 필요함(인거같음)
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {
				break;
		}
			System.out.println("종료");
		}
// in이라는 패키지 안에 들어가는 read (기본 클래스)
// console창에 아무거나 입력하다가 q입력해보고 또 다른거 입력해보면 입력안됌
// if(inputData.contentEquals("q"))이것도 똑같누
	}
}
