package sec02.exam05;

public class ForMultiplicationTableExampleStudy {
//구구단 가로 배치 하기
	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for (int j=2; j<=9; j++) {
					System.out.print(j + " x " + i + " = " + (j*i)+"\t");
			}
			System.out.println();
		}

	}

}