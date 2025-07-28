import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		String[] name = new String[2];
		int[] kor = new int[2]; // 국어
		int[] eng = new int[2]; // 영어
		int[] math = new int[2]; // 수학
		// 이름을 5명 입력받아서 ,
		// 입력이름: 홍길동 유관순 이순신 강감찬 김구
		// 국어점수 : 100 100 100 100 100
		// 영어점수 : 100 100 100 100 100
		// 수학점수 : 100 100 100 100 100
		for (i = 0; i <name.length; i++) {
			System.out.printf("%d번째 학생정보입력 \n", i + 1);

			System.out.println("이름을 입력해주세요\n");
			name[i] = scan.next();
			System.out.println("국어점수를 입력해주세요\n");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력해주세요\n");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력해주세요\n");
			math[i] = scan.nextInt();
			System.out.println();
		}
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("------------------");
		for (i = 0; i < name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\n", name[i], kor[i], eng[i], math[i]);
		}

	}

}
