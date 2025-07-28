
public class C0725_02 {

	public static void main(String[] args) {
		// 객체선언
		Stuscore s = new Stuscore();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 99;
		s.total = s.kor + s.eng + s.math;
		s.avg = s.total / 3.0;
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("------------------------------------------------");
//		System.out.println(s.name + "\t" + s.kor + "\t" + s.eng + "\t" + s.math + "\t" + s.total + "\t" + s.avg + "\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",s.name,s.kor,s.eng,s.math,s.total,s.avg );
		// 홍길동 100 100 99 299 99.67

		System.out.println(s.name);
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr[0]);

	}

}
