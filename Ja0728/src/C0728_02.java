
public class C0728_02 {

	public static void main(String[] args) {
		// Tv 클래스 객체생성을 해서
		// Tv의 색상 pink
		// 채널은 7을 입력하시오.
		Tv t = new Tv();
		t.color = "pink";
		t.channel = 7;
		System.out.printf("색상:%s 채널:%d", t.color, t.channel);
		System.out.println();
   //t2 생성해서 , white 5
		Tv t2 =new Tv();
		t.color = "white";
		t.channel = 5;
		System.out.printf("색상:%s 채널:%d", t.color, t.channel);
	}

}
