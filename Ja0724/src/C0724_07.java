import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {
		// 이름 국어 영어 수학 점수를 입력받아 출력하시오.
		// 1.배열선언 2값입력 3. 출력

		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][5];
		int[] total = new int[5];
		double[] avg = new double[5];
		String[] title = { "국어", "영어", "수학" };

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요>> \n", i + 1);
			name[i] = scan.next();
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d번째 %s점수를 입력하세요.>>", i + 1, title[j]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
			avg[i] = total[i] / 3.0;
		}
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i] + '\t');
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");

			}
			System.out.print(total[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.println();
		}

	}

}
