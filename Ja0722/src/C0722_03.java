
public class C0722_03 {

	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 97;
		System.out.println(c2);
		char c3 = (char) (c1 + 1); // char +int = int
		System.out.println(c3);
		char c4 = ++c1;// 증감연산자 사용시 타입변경 안해도됨 .
		System.out.println(c4);
		int i = 'B' - 'A';
		System.out.println(i);
		int i2 = 'b' - 'a';
		System.out.println(i2);
		int i3 = '1' - '0';
		System.out.println(i3);
		int i4 = '3' - '0';
		System.out.println(i4);
		int i5 = '9' - '0'; // '0' 빼면 문자열이 숫자로바뀜 for문 사용시 사용
		System.out.println(i5);
		int n = 5;
		String s = n + "";//숫자타입을 문자로바꾸는방법 뒤에 +"" 넣는다. 
		
		int n2 =123456789;
		
	}

}
