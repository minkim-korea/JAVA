import java.util.Scanner;

public class C0721_10 {

	public static void main(String[] args) {

// 이름, 국어점수,영어점수를 입력받아 이름,국어,영어,합계점수를 출력하시오.
		// 1. Scanner 2.이름 3.국어 4.영어 -> 이름,국어,영어,합계점수 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.> ");
		String name = scan.nextLine();
		System.out.println("국어점수를 입력하세요.> ");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.> ");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.> ");
		int math = scan.nextInt();
		int total = kor + eng + math;
		double avg = (double) total / 3;
//		double avg= total/(double)3;  
//		double avg= total/3.0; 3개 다똑같은거 
		System.out.println("이름 : " + name);
		System.out.println("합계 : " + total); // 자리수 결정이안됨
		System.out.printf("합계 : %d \n", total); // printf 출력형식을 지정가능
		System.out.printf("평균: %.2f \n", avg);
		System.out.printf("평균: %e \n", avg);
		System.out.printf("이름:%s,국어:%d,영어:%d,수학:%d, 합계:%d, 평균:%.2f \n", name, kor, eng, math, total, avg);

	}

}
