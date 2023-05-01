package sec01.exam02;

public class VariableScopeExample {

	public static void main(String[] args) {
		 int v1 = 15;
	      if(v1>10) {
	         int v2;
	         v2 = v1 - 10;
	         System.out.println(v2);
	      }
	      //int v3 = v1 + v2;
	      //수식이 마쳐졌기때문에 더 이상 값을 구하지 못한다.
	      //이 수식이 완성 되기 위해선 하위 처럼 작성해야한다.
			// int v1 = 15;
		    //  if(v1>10) {
		    //     int v2;
		    //     v2 = v1 - 10;
		    //     int v3 = v1 + v2;
		    //     System.out.println(v2);    =5
		    //     System.out.println(v3);	  =20 
	      
	      //"sysout" + ctrl + space = System.out.println();
	      //int 변수형
	}

}
