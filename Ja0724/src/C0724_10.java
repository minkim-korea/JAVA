import java.util.Scanner;

public class C0724_10 {

	public static void main(String[] args) {
		// 1.변수배열선언 - 번호,이름,점수,합계,평균,타이틀,count
		// 2.출력구문 - while(true), switch구문

		// 3.입력부분
		// 4.취소부분추가
		// 5.출력부분
		// 6.프로그램종료부분

		Scanner scan = new Scanner(System.in);
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0; // 입력된 학생수
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균" };
		// 1변수배열선언

		loop: while (true) {

			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.(0.종료)>> ");
			int choice = scan.nextInt();

			switch (choice) {

			case 1: // 입력
				no[count] = count + 1; // 번호입력
				System.out.printf("%d번 학생이름을 입력하세요.(0.취소)>> \n", count + 1);
				name[count] = scan.next(); // 이름입력
				if (name[count].equals("0")) {
					System.out.println("이전화면으로 이동합니다.");
					System.out.println();
					break;
				} // if
					// 국어,영어,수학입력
				for (int i = 0; i < score.length; i++) {
					System.out.printf("%s 점수를 입력하세요.>> \n", title[i + 2]);
					score[count][i] = scan.nextInt();
				} // for
				total[count] = score[count][0] + score[count][1] + score[count][2];
				avg[count] = total[count] / 3.0;
				System.out.printf("%d 번 학생성적이 저장되었습니다.\n", count + 1);
				count++;
				System.out.println();
				break;

			case 2:// 출력
				System.out.println("[성적 출력]");
				for (int i = 0; i < title.length; i++) {
					System.out.printf("%s\t", title[i]);
				}
				System.out.println();
				System.out.println("--------------------------------------------");
				// 학생수만큼 출력
				for (int i = 0; i < count; i++) {
					System.out.printf("%d\t", no[i]);
					System.out.printf("%s\t", name[i]);
					for (int j = 0; j < score[i].length; j++) {
						System.out.printf("%d\t", score[i][j]);
					}
					System.out.printf("%d\t", total[i]);
					System.out.printf("%.2f\n", avg[i]);
				}
				System.out.println();
				System.out.println();
				break;
			case 3:// 수정
				System.out.println("학생성적수정");
				System.out.println("찾고자하는 이름을 입력하세요");
				String search = scan.next();

				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break loop;

			}// switch

		} // while

	}

}
