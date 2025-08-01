import java.util.ArrayList;

public class C0801_06 {

	public static void main(String[] args) {
//		wrapper 클래스 8가지 기본타입의 객체타입을 말함.  
		//자바 - 객체지향언어 ,
		//boolean ,char, byte, short, int, long, float, double -객체가아님 .
	    ArrayList list = new ArrayList()	;//객체만넣을수있음 
	    int a = 10 ;//기본타입 
	    list.add(a); //가능함. ->자동으로 객체형변환시켜줌 int ->integer 형변환 
	    System.out.println(list.get(0));
	    
	Student s = new Student(1,"홍길동");
	System.out.println(s.getName());
     list.add(s);
	System.out.println( ((Student)list.get(1)).getName());
		
		
		
		
		
		
		// Math 클래스
//
//		int a = 100;
//		int b = 50;
//		int c = 90;
//		// 최대값을 출력하시오.
//		System.out.println(Math.max(a, Math.max(b, c)));
//		System.out.println(Math.min(a, Math.min(b, c)));

//   랜덤메소드
//		Math.random();
		// 반올림
//		Math.round(0);
		// 버림
//		Math.floor(0);
		// 올림
//		Math.ceil(0);
//		절대값
	    // Math.abs(a);
// 		System.out.println(Math.pow(10, 3));

		
		
		
		
		
//      StringBuffer클래스
//		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);
//		// 추가방법
//		sb.append("123");
//		System.out.println(sb);
//		// 지울때
//		sb.delete(0, 1);
//		System.out.println(sb);
//		
//		StringBuffer str = new StringBuffer("가");
//		for (int i = 0; i < 100; i++) {
//			str.append(i);
//		}
//		System.out.println(str);

		// 추가는 append
//		String a = "가";
//		for(int i=0;i<100;i++) {
//			a= a+i;
//		}
//		System.out.println(a);// 결과값은 1개지만 주소는 여러개만들어짐 why? ->String 특성  ->해결방안 StringBuffer append를사용한다.
//		
//		

//		int a = 10 ;
//		String str =""+a;

		// 배열에 적용
//      String[] strArr = {"abc123","a12","bc23456"};
//      //처음부터 제일뒤에서 1칸 앞까지 출력하시오 
//      for(int i=0;i<strArr.length;i++) {
//    	  System.out.println(strArr[i].substring(0,strArr[i].length()-1));
//      }
//		

//		String str ="16조12345";
		// subString -부분으로 가져오기

		// 1234 까지
//		System.out.println(str.substring(3,7));

		// 12345만출력하시오
//		System.out.println(str.substring(3));

		// 16만 출력하시오
//		System.out.println(str.substring(0,2));

		// 123 만출력하시오
//		System.out.println(str.substring(3,6));

		// 조 를출력하시오
//		System.out.println(str.charAt(2));
//        

		// startsWith
//		String str ="abc.txt";
//		System.out.println(str.startsWith("ab"));
//		

	}

}
