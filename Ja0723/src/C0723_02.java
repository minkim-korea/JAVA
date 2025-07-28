import java.util.Scanner;

public class C0723_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 해당월을 입력받아 345봄678여름9,10,11가을12,1,2겨울 출력하시오
		System.out.println("월을 입력해주세요");
		int score = scan.nextInt();
		// if
		if (score == 3 || score == 4 || score == 5) {
			System.out.println("봄이네요");
		} else if (score == 6 || score == 7 || score == 8) {
			System.out.println("여름이네요");
		} else if (score == 9 || score == 10 || score == 11) {
			System.out.println("가을이네요.");
		} else if (score == 12 || score == 1 || score == 2) {
			System.out.println("겨울이네요.");
		} else {
			System.out.println("1~12월사이 숫자만 입력하세요");
		}
		// switch
		switch (score) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			break;

		}

//		// 성적을 입력받아 , 90점이상 90A,80B,70C,60D,60미만F 를출력하시오
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성적을 입력하세요.>>");
//		int score = scan.nextInt();
//
//		// if문
//		if (score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
	}

}
