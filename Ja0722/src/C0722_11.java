import java.util.Scanner;

public class C0722_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//     	System.out.println("숫자를 입력하세요. >>");
//        int input = scan.nextInt();
        
       
        
        
//		// 랜덤숫자 1-100까지 랜덤 숫자를 생성하시오
//         int rnum = (int)(Math.random()*3)+1; //1~3 
         //가위1 바위 2 보 3
         
         // 1-3, 2-1,3-2 승리 
         // 1-1 ,2-2,3-3 무승부 
         // 1-2,2-3,3-1 패배 
         //if 문을 사용해서 가위바위보 게임을 완성하시오. 
         System.out.println("[가위바위보게임]");
         System.out.println("1.가위");
         System.out.println("2.바위");
         System.out.println("3. 보");
         System.out.println("----------------");
         System.out.println("원하는 번호를 입력하세요.>>");
         int choice =scan.nextInt();
         int com =(int)(Math.random()*3) +1;
         String[] rcp = {"","가위","바위","보"};
         //승리 ,무승부 ,패 출력하시오 
         if (choice==com) {
        	 System.out.println("무승부");
         }else if ((choice==1 && com ==3)|| (choice==2 && com==1)|| (choice==3 &&com==2)) {
        	 System.out.println("승리");
         }else {
        	 System.out.println("패배");
         }
         System.out.println("나 : "+rcp[choice]);
         System.out.println("컴퓨터 :"+rcp[com]);
         
         
         
         
         
//         
//         if(input ==rnum) {
//        	 System.out.println("정답");
//         }else {
//        	 System.out.println("오답");
//         }
//         System.out.println("랜덤숫자:" +rnum);
         
//         int rnum2 = (int)(Math.random()*5)+1;//1~ 5
//		System.out.println((int) (Math.random() * 100));
		
		// 0.0*10 <= Math.random()*10 <1 *10
		// 0+1 <=x+1<10+1
		// 1 <= x <11
		// 0.9525422277436866 -> 0.9
		// System.out.println((int)(Math.random()*10)+1); //1<=x =10
//		System.out.println(Math.floor(Math.random()*10)/10.0);//0.9525422277436866 -> 0.9 
		// 절사

//		boolean power  = false ; 
//		if(!power) {
//			power = true;
//		}

//		System.out.println("문자를 입력하세요.>>");
//	    String input = scan.nextLine(); //엔터키 문자로 인식 ,입력받음
////		String input = "";
//		char ch = ' ';
//		if(input !=null && !input.equals("")) {
//		     ch = input.charAt(0);
//		}		  
//		
//	    System.out.println("출력 : "+ch);
//	    
	}

}
