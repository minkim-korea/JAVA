
public class C0801_01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {// 예외처리 -프로그램이 다운되지않고 잘 실행이 됨.
			System.out.println(0 / 0); // 숫자를 0으로나누는것은 에러
			throw new Exception();  // 강제예외를 발생하는 명령어 
		} catch (ArithmeticException e) {
			e.printStackTrace();// try문안에 에러가 어떤에러인지 알려줌
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("반드시 실행되는 위치");
		}
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

//    System.out.printl();//오타오류 -에러 : 컴파일 에러 실행전에러
//		int[arr] = {1,2,3};
//		System.out.println(arr[10]);args //런타임에러: 실행후
	}

}
