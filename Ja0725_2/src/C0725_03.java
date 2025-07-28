import java.util.Scanner;

public class C0725_03 {

	public static void main(String[] args) {
		// s1,s2 를선언해서
		// s1,-홍길동 100 100 99 합계평균
		// s2,-유관순 90 90 91 합계 평균
		Scanner scan = new Scanner(System.in);
		Stuscore s = new Stuscore();
		System.out.println("이름입력해봐");
		s.name= scan.next();
		System.out.println("국어점수입력해봐");
		s.kor= scan.nextInt();
		System.out.println("영어점수입력해봐");
		s.eng= scan.nextInt();
		System.out.println("수학점수입력해봐");
		s.math= scan.nextInt();
		s.total=s.kor+s.eng+s.math;
		s.avg=s.total/3.0;
		
		
		Stuscore s1 = new Stuscore();
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 99;
		s1.total = s1.kor + s1.eng + s1.math;
		s1.avg = s1.total / 3.0;
		
		Stuscore s2 = new Stuscore();
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 91;
		s2.total = s2.kor + s2.eng + s2.math;
		s2.avg = s2.total / 3.0;

		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", s1.name, s1.kor, s1.eng, s1.math, s1.total, s1.avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", s2.name, s2.kor, s2.eng, s2.math, s2.total, s2.avg);
        System.out.println("내가입력한값은");
		System.out.print(s.name+"\t");
		
        System.out.print(s.kor+"\t");
        System.out.print(s.eng+"\t");
        System.out.print(s.math +"\t");
        System.out.print(s.total+"\t");
        System.out.print(s.avg+"\t");
	}

}
