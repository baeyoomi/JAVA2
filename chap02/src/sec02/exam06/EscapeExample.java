package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		// 텍스트를 효과적으로 출력하기 위한 표현방법 
		// \t(탭) , \"\" , \ , \n (println에서 ln으로 줄바꿈을 썼기때문에 중복사용하지 않으려고 뺌)
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는\"개발자\"입니다.");
		System.out.print("봄\\여름\\가을\\겨울");
	}

}
