import java.util.Scanner;

public class C0722_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요>>");
		int score = scan.nextInt();
		
		//97점이상 A+ , 93A- , 87점이상 B+ 83점 B-
		//100~97 :A+ 96~94: A 93~90:A- 
//		if (score<=100 && score>=97) {
//			System.out.println("A+");
//		}else if (score<=96 && score>=94) {
//			System.out.println("A");
//		}else if (score<=93 && score>=90) {
//			System.out.println("A-");
//		}else if (score<=89 && score>=87) {
//			System.out.println("B+");
//		}else if (score<=86 && score>=83) {
//			System.out.println("B");
//		}else if (score<=82 && score>=80) {
//			System.out.println("B-");
//		}
		
		
		String result = "";
		if(score>=90) {
			result ="A";
			if(score>=97) {
				result +="+";
			}else if(score<=93) {
				result += "-";
				}
		 }else if (score>=80) {
			result = "B";
			if(score>=87) {
				result +="+";
				
			}else if(score<=83) {
				result +="-";
				
			}
		}else if (score>=70) {
			result = "C";
			
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
//		
//		
////		
////		// 90점이상 a, 80점b 70c 60 d f
////		if (score >= 90) {
////			System.out.println("A");
////		} else if (score >= 80) {
////			System.out.println("B");
////		} else if (score >= 70) {
////			System.out.println("C");
////		} else if (score >= 60) {
////			System.out.println("D");
////		} else {
////			System.out.println("F");
////		}
//
//		

		// // 양수 , 0 , 음수

//		System.out.println("숫자를 입력하세요 >>");
//		int input = scan.nextInt();
//
//		if (input>0){
//			System.out.println("양수입니다.");
//		}else if (input == 0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}

	}

}
