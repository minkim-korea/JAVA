
public class C0728_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// stuscore 객체 -홍길동 100 100 100
		StuScore s = new StuScore();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 100;
		s.total = s.kor + s.eng + s.math;
		s.avg= s.total/3.0;
		System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 합계:%d 평균:%.1f\n", s.name, s.kor, s.eng, s.math, s.total,s.avg);
		System.out.println();
		// 객체선언 - 유관순 90 90 91
		StuScore s2 = new StuScore();
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 91;
		s2.total = s2.kor + s2.eng + s2.math;
		s2.avg= s2.total/3.0;
		System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 합계:%d 평균:%.2f\n", s2.name, s2.kor, s2.eng, s2.math, s2.total,s2.avg);


	   s2 =s; //홍길동
	   System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 합계:%d 평균:%.2f\n", s2.name, s2.kor, s2.eng, s2.math, s2.total,s2.avg);
	   
	   s.name="이순신"; //이순신 
	   System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 합계:%d 평균:%.2f\n", s2.name, s2.kor, s2.eng, s2.math, s2.total,s2.avg);
	
	
	
	}

}
