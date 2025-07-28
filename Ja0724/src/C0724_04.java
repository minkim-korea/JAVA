 import java.util.Scanner;

public class C0724_04 {

	public static void main(String[] args) {
		// 1-45까지 숫자 6개를 입력받고
		// 로또 번호 6개를 생성해서 출력하시오.
		// 입력번호 : 1 45 3 10 5 20
		// 로또번호 : 20 4 9 35 7 21
		// 1~45까지 숫자가 들어있는 배열생성
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int[] mynum = new int[6];
		int[] num = new int[45];
		// 번호입력
		for (i = 0; i < 45; i++) {
			num[i] = i + 1;
		}
		// 번호섞기
		int rnum = 0;
		int temp = 0; // 임시저장
		for (i = 0; i < 300; i++) {
			rnum = (int) (Math.random() * 45);// 0-44
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;

		}
        //직접 번호 입력 
		for (i = 0; i < 6; i++) {
			System.out.printf("숫자6개를 골라주세요[1~45] %d번째선택", i + 1);
			mynum[i] = scan.nextInt();
			
		}
		//내가입력한번호출력
        System.out.println();
        System.out.print("입력번호:");
        for(i=0;i<6;i++) {
        	System.out.print(mynum[i]+" ");
        	
        }
		//로또번호출력
		System.out.println();
		System.out.print("로또번호:");
		for (i = 0; i < 6; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
