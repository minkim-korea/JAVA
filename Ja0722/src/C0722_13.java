import java.util.Scanner;

public class C0722_13 {

	public static void main(String[] args) {

		// 1-3,2-1,3-2 승리
		// 1-1,2-2,3-3 무승부
		// 1-2,2-3,3-1 패배
		// if 문을 사용해서 가위바위보 게임을 완성하시오.

		Scanner scan = new Scanner(System.in);
		String[] rcp = {"","가위","바위","보"};
		
		System.out.println("[가위바위보게임]");
		System.out.println("1.가위");
		System.out.println("2.바위");
		System.out.println("3. 보");
		System.out.println("----------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		
		int input = scan.nextInt();
		int com =(int)(Math.random()*3) +1;
		
		switch (input-com) {
		case 0:
			System.out.println("무승부");
			break;
		case -2:
			System.out.println("승리");
			break;
		case 1:
			System.out.println("승리");
			break;
		default:
			System.out.println("패배");
			break;
		}
		   System.out.println("나 : "+rcp[input]);
	       System.out.println("컴퓨터 :"+rcp[com]);
	}

}
