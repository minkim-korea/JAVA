
public class C0729_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////    int a= 10; int a = 5 ; //동일 이름안됨
//		//인스턴스 -객체선언후 사용 
//		MyMath m = new MyMath();
//		
//		m.add();//인스턴스메소드 - 객체선언후 사용 
//		m.a=100; //인스턴스 변수 -객체선언후 사용
//		m.b=50; 
//		
//        System.out.println(m.add()); 
// 
//        long result =MyMath.add(100,50);// 클래스 메소드 =객체선언없이사용 클래스명.메소드명
//        System.out.println(result);
       
		System.out.println(1);
		System.out.println("2");
		System.out.println('3');
		System.out.println(false);
	}
		static void add(int a, String b) {
			System.out.println(a); 
			System.out.println(b); 
			
		}
		
		static void add(int a) {
			System.out.println(a); 			
		}
		
		static void add(char a) {
			System.out.println(a); 			
		}
		static void add(String a) {
			System.out.println(a); 			
		}
		
		static void add(boolean a) {
			System.out.println(a); 			
		}
		
		
	

}
