//import java.util.Scanner;

public class C0723_06 {

	public static void main(String[] args) {
		System.out.printf("[%5d]\n",5);
		System.out.printf("[%05d]\n",5);
		
		for(int i=1;i<=100;i++) {
			System.out.printf("[%03d]\n",i);
		}
		int a = 88;
     System.out.println("0"+a);//088
     String str =String.format("%03d", a);
     System.out.println(str); //088
		
		
		
		
		
		
		
		
		
//		for (int i=5;i>=1;i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}

//		// 구구단 출력
//		// 2 x 1 = 2 형태로 출력
//		// 중첩 for 문
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[%d단]\t\t", i);			
//		}
//		System.out.println();
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.printf("%d x %d =%d \t", j, i, i * j);
//			}
//			System.out.println();
//		}

//	 for (int i=0;i<=9;i++) {
//		 for(int j=0;j<=9;j++) {
//			 for(int k=0;k<=9;k++) {
////				 System.out.println(""+i+j+k);
//				 System.out.printf("%d%d%d\n",i,j,k);
//			 }
//		 }
//	 }
//		

		// 2개 숫자를 입력받아 , 3 7 3단~7단까지 출력하시오 .
//		Scanner scan = new Scanner(System.in);
//		System.out.println("1~9숫자를 입력해주세요");
//		int input =scan.nextInt();
//		System.out.println("1~9숫자2를 입력해주세요");
//	    int input2 =scan.nextInt();
//	    int temp=0;
//	    if(input>input2) {
//	    temp=input;
//	    input=input2;
//	    input2=temp;
//	    }
//	    for(int i=input;i<=input2;i++) {
//			System.out.printf("[%d 단]\n" ,i);
//            for(int j=1;j<=9;j++) {
//           	 System.out.printf("%d x %d =%d \n",i,j,i*j);
//             }
//             System.out.println();
//		}
//		

		// 중첩 for 문
//		for(int i =2;i<=9;i++) {
//			System.out.printf("[%d 단]\n" ,i);
//             for(int j=1;j<=9;j++) {
//            	 System.out.printf("%d x %d =%d \n",i,j,i*j);
//             }
//             System.out.println();
		// }

	}
}