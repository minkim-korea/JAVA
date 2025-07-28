import java.util.Scanner;

public class C0723_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] name = new String[2];
		int[] kor = new int[2]; // 국어
		int[] eng = new int[2]; // 영어
		int[] math = new int[2]; // 수학
		int[] total = new int[2]; // 합계
		double[] avg = new double[2]; // 평균
		for (int i = 0; i < name.length; i++) {
			System.out.printf("%d번째 학생정보입력 \n", i + 1);

			System.out.println("이름을 입력해주세요\n");
			name[i] = scan.next();
			System.out.println("국어점수를 입력해주세요\n");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력해주세요\n");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력해주세요\n");
			math[i] = scan.nextInt();
			total[i]= kor[i]+eng[i]+math[i];
			avg[i]= total[i]/3.0;
			System.out.println();
		}
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("------------------------------------------------------");
		for (int i = 0; i < 2; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], kor[i], eng[i], math[i],total[i],avg[i]);
		}
	
	
	 
	
	}
}