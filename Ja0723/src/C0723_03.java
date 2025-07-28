import java.util.Scanner;

public class C0723_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// double ran =(int)(Math.random()*45)+1; //1~45
		int rnum = (int) (Math.random() * 10) + 1; // 1~10
		System.out.println("[랜덤숫자 맞추기]");
		System.out.println("1-10까지 숫자를 입력하세요.>>");
		int input=scan.nextInt();
		//if문 사용 
		if(input==rnum) {
			System.out.println("정답!!!");
		}else if(input>rnum) {
			System.out.println("입력한값이 더커요");
		}else if(input<rnum) {
			System.out.println("입력한값이 더작아요");
		}else {
			System.out.println("에러");
		}
		
		System.out.println("입력한값: "+input);
		System.out.println("랜덤숫자: "+rnum);
	}

}
