
public class Point extends Object {
	int x;
	int y;

	Point() {
		this(0, 0); // this() :다른생성자
	}

	Point(int x, int y) {
		super();
		this.x = x; // this : 인스턴스변수가르킴
		this.y = y;

	}

	void add() {
		System.out.println(x + y);
	}
}
