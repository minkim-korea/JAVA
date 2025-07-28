import java.util.Scanner;

public class C0722_02 {
	// 메소드,함수 -main()함수
	public static void main(String[] args) {
		// input ("숫자를입력하세요.")
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.>>");
		String name = scan.next(); // nextLine() -문자열입력받음.
		System.out.println("국어점수를 입력하세요.>>");
		// nextByte(),nextShort(),nextInt(),nextLong(),nextFloat(),nextDouble()
		int kor = scan.nextInt();
        System.out.println("영어점수를 입력하세요.>>");
        int eng = scan.nextInt();
        System.out.println("수학점수를 입력하세요.>>");
        int math = scan.nextInt();
        
        int total = (int)kor+eng+math;
        double avg =  total/3.0;
        		
		System.out.println("이름:" + name);
		System.out.println("국어점수:" + kor);
		System.out.println("영어점수:" + eng);
		System.out.println("수학점수:" + math);
		System.out.println("합계점수:" + total);
		System.out.printf("평균: %.3f \n" ,avg);
	     
		System.out.println("--------------------------------------");
		System.out.printf("이름\t국어\t영어\t 수학\t합계\t평균\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,total,avg);

	}

}
