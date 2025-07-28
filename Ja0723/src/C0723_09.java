import java.util.Scanner;

public class C0723_09 {

	public static void main(String[] args) {

		// 1-100까지 랜덤숫자를 생성해서 20번을 입력해서 정답 오답 -크다 작다 20번기회 입력된숫자 :12345
		// 정답: 50
		Scanner scan = new Scanner(System.in);
		int rnum = (int) (Math.random() * 100) + 1;
		int[] input = new int[20];
		int count = 0;

		for (int i=0;i<input.length;i++) {

			System.out.printf("%d번째 숫자를입력해주세요", i+1);
			input[i] = scan.nextInt();
			count++;
			// if
			if (rnum == input[i]) {
				System.out.println("정답입니다.");
				System.out.println("입력된숫자: " +input[i]);
				break;
			} else if (rnum > input[i]) {
				System.out.println("오답 입력한값이작습니다.");
			} else {
				System.out.println("오답 입력한값이큽니다.");
			}
		}//for
		System.out.println();
		System.out.println("[입력한값]");
		
		for (int i=0;i<count;i++){
			System.out.print(input[i]+ "  ");
		}
		System.out.println();
		System.out.println("정답: " + rnum);

		// int[]score = {10,20,5,2,3,4};
//		for(int i=0;i<score.length;i++) {
//			System.out.println(score[i]);
//		}
//      System.out.println(score[2]);
	}

}
