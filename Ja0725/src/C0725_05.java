import java.util.Scanner;

public class C0725_05 {

	public static void main(String[] args) {
     Scanner scan =new Scanner(System.in);
		//반복문 
		while(true) {
			System.out.println("[학생성적프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("원하는 번호를 입력하세요.(0.종료)>>");
			int choice= scan.nextInt();
		    if(choice==0) {
		    	break;
		    }
		}
		
		
		
		
		
		//무한반복
//		int i =0;
//		for(;;i++) { //조건식이 없으면 무한반복
//			System.out.println(i);
//		}
		
		
		//무한반복 
//		int i =0;
//		while(true) {
//			System.out.println(i);
//			i++;
//		}
//		
		
		
		//while 반복문 
//		int sum = 0;
//		int i = 0;
//		while (i <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println(i);
//		System.out.println("합계 :" + sum);

		//for 반복문
//		int sum = 0;
//		int i =0;
//        for(i=1;i<=10;i++) {
//        	sum += i;
//        	
//        }
//        System.out.println(i-1);
//        System.out.println("합계  :"+sum);
		// for(int i=0;i<10;i++) {
//			System.out.println(i);
//			
//		}

	}

}
