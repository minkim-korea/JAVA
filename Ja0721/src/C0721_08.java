import java.util.Scanner;

public class C0721_08 {

	public static void main(String[] args) {
		// Scanner
		// print -> System.out.println
		// input -> Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		// next(),   (엔터키받을수있는유일한애)nextLine():문자열
		// nextByte(),nextShort(),nextInt(),nextLong():정수형
		// nextFloat,nextDouble: 실수형
		int num = scan.nextInt(); //5+enter키 
		scan.nextLine();
		System.out.println("입력한 숫자:" + num);
		System.out.println("숫자2 를 입력하세요.");
		String str =scan.nextLine();		
		//숫자타입으로 변경 INT 
		int num2= Integer.parseInt(str);//문자열을 정수형으로 변환 
	    System.out.println("숫자 더하기 :" +(num+num2));// 5+100 =105 
	    
		// String str = "abc";
		//		String str2 = new String("abc");	
		//		int a =100;
		//		

	}

}
