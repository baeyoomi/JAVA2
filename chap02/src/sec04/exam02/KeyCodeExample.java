package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
 // throws = 예외처리 -아직안배움
		// 예외처리 왜함? 원래는 메인에 예외처리 안함 앞으론 하지 마셈, 무식한 방법이라고 하심
		// out은 통제하지 않을게~ 근데 in은 통제할거야, 예외적으로 처리하겠다고 설정 해놓으면 오류날때 해결해줄게
		// 나중에 배울거임   //선생님이 USB 입출력에 비교하심
	}

}

// 콘솔에서 a 입력후 엔터치면 밑에 결과나옴
// keyCode: 97
// keyCode: 13 (엔터임ㅎㅎ)
// keyCode: 10 (엔터임ㅎㅎ)