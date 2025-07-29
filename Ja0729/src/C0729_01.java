import java.util.Arrays;
import java.util.Scanner;

public class C0729_01 {

	public static void main(String[] args) {
		//다른클래스 사용시 -객체선언후 사용 
		Cal cal = new Cal();
		Scanner scan = new Scanner(System.in);
		
		int a =10;
		int b =5;
		System.out.println("[사칙연산 프로그램]");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("5.모든계산배열");
		System.out.println("원하는 번호 입력하세요.>>");
		int choice = scan.nextInt();
		int result =0;
		double[] number =new double[4];
		double result4 =0;
		switch(choice) {
		case 1:
			result= cal.add(a, b);
			System.out.println("결과:"+result);
			break; 
		case 2: 
			result= cal.minus(a, b);
			System.out.println("결과:"+result);
			break;
		case 3: //여기서 출력하는법  아래와다름 
			result= cal.multi(a,b);
			System.out.println("결과:"+result);
			break;
		case 4: //void sub 쪽에서 출력 하는법 
		    cal.sub(a,b,result4);
			break; 
		case 5: 
			//a,b,배열num 매개변수
			//사칙연산 
			//결과값을여기에서 출력하시오 .
			//더하기 : 15
			// 빼기 : 5 
			//곱하기 : 50 
			// 나누기 : 2.0 
		    cal.calProcess(a, b, number);
			System.out.println("결과:"+Arrays.toString(number));
		}//switch
		
		

}//class
}//main
