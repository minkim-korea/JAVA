import java.util.Arrays;
import java.util.Scanner;

public class Process {
	Scanner scan = new Scanner(System.in);
	
	//자바 메소드 단점 : return 1개만 가능
	void resultProcess(int a,int b,double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
	
	
	void gugudan() {
		//구구단
		System.out.println("2단에서 부터 원하는 단을 입력하세요.");
		int number = scan.nextInt();
		
		System.out.println("        [ 구구단 ]");
		System.out.println("--------------------------");
		for(int i=2;i<=number;i++) {
			System.out.printf("[  %d 단  ] \n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d X %d = %d \n",i,j,i*j);
			}
		}
	}
	
	
	void numProcess() {
		//숫자맞추기 프로그램 구현하시오.
		//1-100까지 10번입력받아, 10이후 정답 출력
		
		int[] input = new int[10];
		int answer = (int)(Math.random()*100)+1;
		int i = 0;
		while(i<10) {
			System.out.println("       [ 숫자맞추기 ] ");
			System.out.println("----------------------------");
			System.out.println("1-100까지 숫자를 입력하세요.>> ");
			input[i] = scan.nextInt();
			if(answer>input[i]) {
				System.out.println("입력한 값이 작습니다. 더 큰수를 입력하세요!");
			}else if(answer<input[i]) {
				System.out.println("입력한 값이 큽니다. 더 작은수를 입력하세요!");
			}else {
				System.out.println("정답입니다.");
				break;
			}
			i++;
		}//while
		
		System.out.println("정답 : "+answer);
		System.out.println("입력번호 : "+Arrays.toString(input));
	}
}