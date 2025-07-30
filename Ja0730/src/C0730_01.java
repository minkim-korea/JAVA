                         //extends 상속받을조상클래스 관계가맺어지면 형변환 
public class C0730_01 extends Point {
//    int x; //인스턴스 변수 -객체선언후 개별 ,참조변수명.변수명
//    int y;
	  int z;

	public static void main(String[] args) {
		C0730_01 c = new C0730_01();
		System.out.println("x:" + c.x);// 상속을받아 x출력가능 (Point.java)
		System.out.println("z:" + c.z);
	 c.x=100;
	 c.add();
	
	
	}

}
