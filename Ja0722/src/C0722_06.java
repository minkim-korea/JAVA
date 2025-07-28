import java.util.Scanner;

public class C0722_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String input = scan.next();  // 123,1a3,a12345
//      String input =scan.next();
		char ch = input.charAt(0);
		//숫자인지 아닌지 출력하시오. 
		if (ch >= '0' && ch <= '9') {
			System.out.println("숫자입니다.");
			int num = ch -'0';//문자타입을 int 타입으로변경
                               // Integer.parseInt(input)
		} else {
			System.out.println("숫자가아닙니다.");
		}
		
		// 숫자인지 아닌지 파악하시오

//      
//      if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
//    	  System.out.println("영소문자입니다.");
//      }else {
//    	  System.out.println("영소문자가아닙니다.");
//      }
//      System.out.println("입력:"+input);
//      System.out.println("입력:"+ch);
		// 첫글자가 영문자인지 아닌지 출력하시오
		// 영문자입니다. 영문자가아닙니다.

	}
}
