
public class Shape {
	String color = "blue";

	void draw(String sname,Point p) {
		System.out.println(sname + "도형의 그림을 그립니다.");
		System.out.printf("[좌표: %d,%d]\n",p.x,p.y);
		// 하단으로 그림을 그리는 로직이 더 들어가야함.
		// ......
	}
	//오버로딩 -메소드명은 같고 매개변수타입이나개수가다름
	void draw(String sname,Point[] p) {
		System.out.println(sname + "도형의 그림을 그립니다.");
    for(int i=0;i<p.length;i++) {
    	System.out.printf("[좌표 : %d,%d]\n",p[i].x,p[i].y);
    }
	}
}
