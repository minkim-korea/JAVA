
public class C0801_04 {

	public static void main(String[] args) {
		// String 클래스
		// indexOf 찾고자하는 단어위치를 알려줌
		//// 없으면 -1 리턴
		String a = "abcdefg";
//		System.out.println(a.indexOf("h"));

		String str = "abcabcaaabbbbbbbchijkcaacaaaaaa";
		// c가 몇개 있는지 개수를 출력하시오 .
		// indexOf ->현재있는 위치 =>+1 시작 -> count 가-1나올때까지 계속 for문
		// indexOf("a',4); //indexOf(찾는문자 ,시작위치)
//		System.out.println(str.indexOf("c"));
		int n = 0;
		int count =0;
        while(true) {
        	n =str.indexOf("c",n);
        	if(n!=-1) {
        		System.out.println(n);
        		n++;
        		count++;
        		
        	}else {
        		System.out.println("프로그램 종료");
        		break;
        	}
        	
        }
	System.out.println("개수 :"+count);

		
		
		
//		//concat 사용법 
//	   String[] str = {"a","b","c","d"};
//	   String[] str2 =new String[4];
//	   //_list를 붙여서 배열에 넣고  출력 
//	   for (int i=0;i<str.length;i++) {
//		   str2[i] =str[i].concat("_list");
////		   str2[i] =str[i]+"_list";
//		   System.out.println(str2[i]);
//	   }

//		String a ="makecake";
//		if(a.contains("c")) { //단어가 포함되어 있는지 확인하는 메소드 
//			System.out.println("있다");
//		}else {
//			System.out.println("없다");
//		}
//		

//		String a ="5조123456789";
//		char b = a.charAt(1); //문자열에서 1개 문자를 가져오는 메소드  
//		
//		System.out.println(b);
//		System.out.println(a.charAt(10));
//		System.out.println(a.charAt(a.length()-1));
//		System.out.println(a.length());//문자길이 

//	String a ="1";
//	for(int i=0; i<100;i++) {
//		a =a+i;
//	}
//	System.out.println(a);
//    String str1 ="abc";
//    String str2 ="abc";
//	String str3 =new String("abc");
//	String str4 =new String("abc");
//	
//	int a=1;
//	int b=1;
//	System.out.println(a==b);//true
//	System.out.println(str1==str2);//true;
//	System.out.println(str3==str4);//false;
//	}
	}
}
