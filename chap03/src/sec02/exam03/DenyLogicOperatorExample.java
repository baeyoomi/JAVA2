package sec02.exam03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		// 단항연산자 , Deny부정
		boolean play = true;
		System.out.println(play);
		
		play = !!play;
		System.out.println(play);
		// ! = not(부정) , !!치면 true 되는데 --+ ++- 같은건가
		
		play = !play;
		System.out.println(play);

	}

}