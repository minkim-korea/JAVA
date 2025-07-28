import java.awt.SystemTray;

public class C0721_01 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("자바시작");
		// 변수타입 -8개
		// char,boolean,(byte,short,*int,long),(float,*double)

		// 실수형 - float ,double
		// 소수점의 유효성 , float-8자리 double-15자리
		// 1.1234567 890 정확도보장x 1.123456789012345 6789 정확도보장x
		float f = 1.1f;// float-접미사 f,F
		double d = 1.1;// double-접미사 d,D생략가능

		// 정수형 -byte,short,int,long 4개
		// int - 숫자크기약21억까지 가능
		// byte- 127까지 숫자 표현 가능
		// short -32000정도까지 숫자표현
		// long - 900경 까지
		long h = 220000000000L; // 900경까지 숫자표현가능 (큰수에 소문자 대문자 접미사 l /L넣어주기 작은수에는안넣어도됨)
		long h2 = 5L;
		long h3 = -22222222222L;

		int i = 10;
		int i2 = 2000;
		int i3 = -2000000;
//		int i = 2200000000; //21억까지만 가능함,그외 에러

		// true, false만 올수있음
		boolean b = true; // 무조건 소문자
		boolean b2 = false;
//        boolean b3 ='a'; //에러-true,false 만 올수 있음 

		// 홑따옴표만 '' 가능 ,문자는 1개만 가능
		char c = 'A';
		char c2 = 'B';
		System.out.print(c);
		System.out.println(c2);
		String str = "AB"; // 객체타입 문자열 변수
		System.out.println(str);
//		char a ="A";//에러-문자형은 ''로 입력 
//		char a ='AB' //에러-1개만 가능 

	}

}
