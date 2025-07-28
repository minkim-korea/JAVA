
import java.util.Scanner;

public class C0725_10 {

	public static void main(String[] args) {
		// 학생성적 프로그램
		// 1.성적입력
		// 2.성적출력
		// 3.성적수정
		// ---------------
		// 원하는 번호 입력하세요 .>>
		// 입력받을때 사용
		Scanner scan = new Scanner(System.in);
		// 변수 선언
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0;
		String[] title = { "번호", "이름", "국어", "영어", "수학", "합계", "평균" };
		int choice = 0;
		int input = 0;
		// 반복문
		 while (true) {

			System.out.println("[학생성적프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("-----------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("[학생성적입력]");
				// 번호 이름
				no[count] = count + 1;
				System.out.printf("%d번 이름을 입력하세요\n", count + 1);
				name[count] = scan.next();
				// 성적
				for (int i = 0; i < score.length; i++) {
					System.out.printf("%d번 %s성적을입력하세요", count + 1, title[i + 2]);
					score[count][i] = scan.nextInt();
				}
				total[count] = score[count][0] + score[count][1] + score[count][2];
				avg[count] = total[count] / 3.0;
				count++;
				System.out.println();
				break;
			case 2:
				System.out.println("[학생성적출력]");
				for (int i = 0; i < title.length; i++) {
					System.out.printf("%s\t", title[i]);
				}
				System.out.println();
				System.out.println("-------------------");
				// 학생수만큼출력
				for (int i = 0; i < count; i++) {
					System.out.printf("%d\t", no[i]);
					System.out.printf("%s\t", name[i]);
					for (int j = 0; j < score[i].length; j++) {
						System.out.printf("%s\t", score[i][j]);
					}
					System.out.printf("%d\t", total[i]);
					System.out.printf("%.2f\t", avg[i]);
					System.out.println();
				}
				System.out.println();
				System.out.println();
				break;
			case 3:
				System.out.println("[성적수정]");
				System.out.println("이름을입력하세요");
				String search=scan.next();
				int temp=0;
				for(int i=0;i<count;i++) {
					if(search.equals(name[i])) {
						System.out.printf("%s 학생을 찾았다.\n",name[i]);
						
						System.out.println("[점수수정]");
						System.out.println("-----------");
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.println("-----------");
                        System.out.println("원하는번호 입력");
                        choice=scan.nextInt();
                        
                        switch(choice) {
                        case 1: case 2: case 3:
                        	System.out.printf("현재%s점수:%d \n",title[choice+1],score[i][choice-1]);
                        System.out.println("변경점수입력");
                        input =scan.nextInt();
                        score[i][choice-1] = input;
                        total[i] = score[i][0]+score[i][1]+score[i][2];
                        avg[i] = total[i]/3.0;
                        System.out.printf("%d 점으로 점수가 변경되었습니다.\n",score[i][choice-1]);
                        System.out.println();
                        break;
                        }
                        temp=1;
					}
				}
				if(temp==0) {
					System.out.printf("찾는학생없음\n");
					System.out.println();
				
				}
                break;
			}// switch

		}

	}

}
