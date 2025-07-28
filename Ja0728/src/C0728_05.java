import java.util.Scanner;

public class C0728_05 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		// 홍길동 100 100 100 300 100.0
		// 유관순 90 90 90 270 90.0
		// 이순신 80 80 80 240 80.0
		StuScore[] ss = new StuScore[3]; //객체배열선언
		for(int i=0;i<ss.length;i++) {
			ss[i] = new StuScore();// 객체선언
			System.out.println("이름입력");		   	
			ss[i].name = scan.next();
			System.out.println("국어점수입력");		   	
			ss[i].kor = scan.nextInt();
			System.out.println("영어점수입력");		   	
			ss[i].eng = scan.nextInt();
			System.out.println("수학점수입력");		   	
			ss[i].math = scan.nextInt();
			ss[i].stuTotal();
			ss[i].stuAvg();
			
		}
//		ss[0] = new StuScore();// 객체선언
//		ss[0].name = "홍길동";
//		ss[0].kor = 100;
//		ss[0].eng = 100;
//		ss[0].math = 100;
//		ss[0].total = ss[0].kor + ss[0].eng + ss[0].math;
//		ss[0].avg = ss[0].total / 3.0;

//		ss[1] = new StuScore();// 객체선언
//		ss[1].name = "유관순";
//		ss[1].kor = 90;
//		ss[1].eng = 90;
//		ss[1].math = 90;
//		ss[1].total = ss[1].kor + ss[1].eng + ss[1].math;
//		ss[1].avg = ss[1].total / 3.0;
//
//		ss[2] = new StuScore();// 객체선언
//		ss[2].name = "이순신";
//		ss[2].kor = 80;
//		ss[2].eng = 80;
//		ss[2].math = 80;
//		ss[2].total = ss[2].kor + ss[2].eng + ss[2].math;
//		ss[2].avg = ss[2].total / 3.0;
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t순위");
		System.out.println("---------------------------------------------------------");
        for(int i=0;i<ss.length;i++) {
        	System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", ss[i].name, ss[i].kor, ss[i].eng, ss[i].math, ss[i].total,
        			ss[i].avg);
        	
        }
//        System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", ss[0].name, ss[0].kor, ss[0].eng, ss[0].math, ss[0].total,
//    			ss[0].avg);
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", ss[1].name, ss[1].kor, ss[1].eng, ss[1].math, ss[1].total,
//				ss[1].avg);
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n", ss[2].name, ss[2].kor, ss[2].eng, ss[2].math, ss[2].total,
//				ss[2].avg);

	}

}
