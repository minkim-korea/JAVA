
public class MyMath {
	static long c; // 클래스변수 -static 클래스내 선언
	long a, b;// 인스턴스 변수 -자동초기화됨

	long add() { // 인스턴스메서드 -static없음
		int d = 0; //지역변수, 값을 입력해야됨 자동입력안됨 .
		return a + b;
	}

	static long add(long a, long b) {// 클래스메서드 -static있음
		return a + b;
	}
}
