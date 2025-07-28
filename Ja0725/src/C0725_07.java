
public class C0725_07 {
	
	public static void main(String[] args) {
	// 1차원배열 25개를 1-25까지 입력하여
			// 랜덤으로 섞어서 출력하시오.
			// 순차출력 : 1 2 3 4 5 6 7 8 ... 25까지 출력 먼저하고
			// 랜덤출력 : 21 1 5 9 30 ...... 25개 출력되도록 하시오.
			
			// 2차원 배열에 랜덤번호를 입력해서
			// 2차원 배열을 출력하시오.
			// 21 1 5 9 30
			// 7  6 33 44 45
			
			int[] arr = new int[25];
			
			//배열 번호입력
			for(int i=0;i<arr.length;i++) {
				arr[i] = i+1;
			}
			
			// 순차번호출력
			System.out.print("순차번호 : ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			//랜덤섞기
			int temp = 0; //임시저장번호
			int rnum = 0; //랜덤번호
			for(int i=0;i<300;i++) {
				rnum = (int)(Math.random()*25); // 0-24
				temp = arr[0];
				arr[0] = arr[rnum];
				arr[rnum] = temp;
			}
			
			// 랜덤번호출력
			System.out.print("랜덤번호 : ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			// 5,5 2차원배열
			int[][] score = new int[5][5];
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					score[i][j] = arr[(5*i)+j];
				}
			}
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(score[i][j]+"\t");		
				}
				System.out.println();
			}
			
			
			// 1차원배열
			// 2차원배열
//			int[][] score = new int[5][5]; //5*3 = 15
//			for(int i=0;i<5;i++) {
//				for(int j=0;j<5;j++) {
//					score[i][j] = (5*i)+j+1;
//				}
//			}
//			for(int i=0;i<5;i++) {
//				for(int j=0;j<5;j++) {
//					System.out.print(score[i][j]+"\t");		
//				}
//				System.out.println();
//			}

		}

	}