//import java.util.Scanner;

public class C0723_05 {

	public static void main(String[] args) {
		//500이 넘는 시점 바로 전단계를 출력하시오. 

		int sum =0;
		int i = 0;
		for(i=1;i<=100;i++) {
		 	sum+=i;
	
		if(sum>500) break;
	
		}
		 System.out.printf("i :%d, sum: %d \n",(i-1),(sum-i));
		
//		//1~ 100까지의 합을 출력하시오 
//		// 1에서 얼마까지 더해야 100이넘는수가 나오는지 설계하시오 . 
//		
//		int sum =0;
//		int i = 0;
//		for(i=1;i<=100;i++) {
//		 	sum+=i;
//	
//		if(sum>=100) break;
//	
//		}
//		 System.out.printf("i :%d, sum: %d \n",i,sum);
//		
//		System.out.println("1부터100까지합은: "+sum);
		
		
		
		
		
		
		
		
		
		
		
		// 1-10까지 숫자의 합을 출력하시오
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.printf("합계: %d", sum);

		// 두 수를 입력받아 2,7 2에서 7까지의 합을 구하시오 .

//		Scanner scan = new Scanner(System.in);
//		int sum2 = 0;
//		System.out.println("숫자를입력하세요");
//		int input = scan.nextInt();
//		System.out.println("숫자2를입력하세요");
//		int input2 = scan.nextInt();
//		if(input>input2) {
//			for (int i = input2; i <= input; i++) {
//			sum2 += i;
//		}
//		}else if(input<input2) {
//			 for (int i=input;i<=input2; i++) {
//				 sum2+=i;
//			 }
//		}
//				
//		System.out.println("합계:" + sum2);

	}

}
