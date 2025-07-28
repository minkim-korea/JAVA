import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		// 타입을 꼭 정해야됨 .
		int a = 10;
		float f = 10.0f;
		double d = 10.0;
		// 숫자입력받아
		// 입력받고 싶을때
		Scanner scan = new Scanner(System.in);
		
		//switch를 사용 
		System.out.println("[덧셈 프로그램]");
		System.out.println("1.21억이하덧셈");
		System.out.println("2.21억이상덧셈");
		System.out.println("-------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt(); // 소수점 에러
		
		switch(choice) {
		case 1:
		//21억이하 int 
			System.out.println("숫자를입력하세요");
			int input =scan.nextInt();
			System.out.println("숫자2를입력하세요");
			int input2 =scan.nextInt();
			int total = input+input2 ;
			System.out.println("합계: "+total);
			break;
		case 2:
		//21억이상 long 
			System.out.println("숫자를입력하세요");
			long input3 =scan.nextLong();
			System.out.println("숫자2를입력하세요");
			long input4 =scan.nextLong();
			long total2 = input3+input4;
			System.out.println("합계:"+total2);
			break;
			
			
		}
		
		
		
//		System.out.println("숫자를 입력하세요.");
//		long input = scan.nextLong();
//		System.out.println("숫자2를 입력하세요.");
//		long input2 =scan.nextLong();
//		long total =input+input2;
//		System.out.println("입력숫자: "+input);
//		System.out.println("입력숫자2: "+input2);
//		System.out.println("합계: "+total);

	}

}
