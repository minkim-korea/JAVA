import java.util.Scanner;

public class C0731_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

	
		Buyer b1 = new Buyer("aaa", "홍길동", 10000000, 0);
		System.out.printf("%s님 로그인 성공!\n", b1.name);
		System.out.printf("현재잔액 : %,d \n", b1.money);
		System.out.println("----------------------------");
	   while(true) {
		   
		   System.out.println("[쇼핑몰 프로그램]");
		   System.out.println("1.Tv-1000000");
		   System.out.println("2.Audio-500000");
		   System.out.println("3.Computer-1500000");
		   System.out.println("4.구매내역");
		   System.out.println("5.안사고 나가기 ");
		   System.out.println("----------------------");
		   System.out.println("번호를 입력하세요");
		   
		   int choice = scan.nextInt();
		   switch (choice) {
		   case 1:
			   System.out.println("Tv를 구매했습니다.");
			   b1.buy(new Tv());
			   System.out.printf("현재잔액 : %,d \n", b1.money);
			   break;
		   case 2:
			   System.out.println("Audio를 구매했습니다.");
			   b1.buy(new Audio());
			   System.out.printf("현재잔액 : %,d \n", b1.money);
			   break;
		   case 3:
			   System.out.println("Computer를 구매했습니다.");
			   b1.buy(new Computer());
			   System.out.printf("현재잔액 : %,d \n", b1.money);
			   break;
		   case 4:
			   System.out.println("[구매내역]");
			   for (int i = 0; i < b1.i; i++) {
				   System.out.printf("%s:%d \n", b1.cart[i].name, b1.cart[i].price);
			   }//for
			   break;
		   case 5:
			   break;
		   }//switch
	   }//while

	}//main

}//class
