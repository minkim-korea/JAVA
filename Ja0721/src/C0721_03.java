
public class C0721_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		a=20;
		a=50;
		System.out.println("a: "+a);
		int b =100;
		b=200;
		System.out.println("b:"+b);
		
		//상수
		final int C =1000;
//		C=2000; //에러- 상수는 대문자 중간에 값을 변경할수없음 . 
		System.out.println("C:"+C);
		
		//
		int d =a+b;
		System.out.println("d:"+d);
		
	}

}
