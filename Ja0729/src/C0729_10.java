import java.util.Arrays;
import java.util.Scanner;

public class C0729_10 {

	public static void main(String[] args) {
		// 학생 성적 입력 
		// no -객체선언을 하면 
		//자동으로 번호가 증가되도록 구현 
		//이름,국어,영어,수학       
		// 합계평균을 입력되도록 구현 
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
	int no =0;
    while(true) {
    	
    	System.out.println("[학생성적 프로그램]");
    	System.out.println("1.성적입력");
    	System.out.println("원하는 번호를 입력하세요.>>");
    	int choice = scan.nextInt();
    	switch(choice) {
    	case 1: 
    		System.out.printf("%d 번째 이름을 입력하세요\n",no+1);
    		//프로그램구현
    		//입력정보 : 1 홍길동 100 100 99 299 99.67
    		//입력정보 : 2 유관순 90   90  91 271 90.33
    		//1. 이름 국어 영어 수학 입력받아 
    		Stuscore ss = new Stuscore();
    		ss.name =scan.next();
    		System.out.println("국어점수를입력하세요");
    		ss.kor =scan.nextInt();
    		System.out.println("영어점수를입력하세요");
    		ss.eng= scan.nextInt();
    		System.out.println("수학점수를입력하세요");
    		ss.math=scan.nextInt();
    		ss.total=ss.kor+ss.eng+ss.math;
    		ss.avg =ss.total/3.0;
    		//매개변수가 있는 생성자를 사용 저장하시오 .
    		//stuscore클래스 -> 초기화 블럭사용 
    		s[no]= new Stuscore(ss.name,ss.kor,ss.eng,ss.math);
    		System.out.println(ss.name);
    		no++;
    		break;
       
    		
    	}//switch
    	
    }//while
	
}

}
