
public class RanNum {
	static int[] arr = new int[10];// 클래스변수 -객체선언x 공용 ㅇ 클래스명.변수명
	int a; // 인스턴스변수 - 객체선언 ㅇ 객체개별 ㅇ 참조변수명.변수명
     //생성자보다 먼저 실행 
	// 클래스 초기화 블럭 -객체선언없이 바로실행.
	static {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}

	}
}
