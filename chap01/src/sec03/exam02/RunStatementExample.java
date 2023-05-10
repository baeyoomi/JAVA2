package sec03.exam02;

public class RunStatementExample {

	public static void main(String[] args) {   //main() 메소드 선언
		  int x = 1;     //변수 x 선언하며 1값을 저장
	      int y;         //변수 y 선언
	      y = 2;         //변수 y에 2값을 저장   , 위와 같지만 다른방식으로 작성함
	      //if(x=y){}
	      int result = x + y;    //변수 result를 선언하고 변수 x와 y를 더한 값을 저장
	      System.out.println(result); // 콘솔에 변수의 값을 출력하는 println() 메소드 호출
	}                                 // 실행문 뒤에는 반드시 세미콜론(;)을 붙여야함

}

//맨앞에 대문자X, 띄어쓰기X ,특수문자X ( _ 랑 $만 가능),숫자X,변수이름X(헷갈리니까 되도록 안쓰게),변수이름 글자 수 제한없음