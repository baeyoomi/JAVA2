package sec04.exam02;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
		
	}
	
	int sum2(int ... values) {  //길이가 정해지지 않은 ...문법
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}