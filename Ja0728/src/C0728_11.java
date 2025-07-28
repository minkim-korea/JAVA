import java.util.Arrays;
import java.util.Scanner;

public class C0728_11 {

	public static void main(String[] args) {
		// 숫자맞추기 프로그램
		Scanner scan = new Scanner(System.in);
		Process p = new Process();
		System.out.println("[ 프로그램 ]");
		System.out.println("1. 숫자맞추기");
		System.out.println("2. 로또맞추기");
		System.out.println("3. 구구단");
		System.out.println("4. 결과리턴");
		System.out.println("-----------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			p.numProcess();
			break;
		case 2:
			int[] myNo = new int[6];
			int[] lotto = new int[6];
			int[] okNo = new int[6];
			int count = 0; //맞춘 개수 - 기본변수
			
			//Process.java에 메소드를 구현해서 입력번호,로또번호,맞춘번호를 출력하시오.
			//매개변수 전달 - myNo,lotto,okNo,count
			
			
			System.out.println("입력번호 : "+Arrays.toString(myNo));
			System.out.println("로또번호 : "+Arrays.toString(lotto));
			System.out.print("맞춘번호 : ");
			for(int i=0;i<count;i++) {
				System.out.print(okNo[i]+" ");
			}
			System.out.println();
			
			break;
			
		case 3:
			p.gugudan();
			break;
		
		case 4:
			// 10,5 더하기,빼기,곱하기,나누기의 값을 출력
			double[] result = {0,0,0,0};
			int a = 10;
			int b = 5;
			p.resultProcess(a, b,result);
			System.out.println(Arrays.toString(result));
			
			break;
			
		}//switch	
	}

}
