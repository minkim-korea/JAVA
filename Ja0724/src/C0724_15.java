
public class C0724_15 {

	public static void main(String[] args) {
		
		int[]arr =new int[25];
		// 1,2,3,.....,25
		// 1-> 7개만 넣고싶다 0을 모두채우고 , 1을 7개를 넣고 무작위로 돌리기한다. 
        for(int i=0;i<arr.length;i++){
        	arr[i]=0;
        } 
        for(int i=0;i<7;i++) {
        	arr[i]=1;
        }
        //랜덤돌리기 
        int temp=0;
        int rnum= 0;
        
        for(int i=0;i<300;i++) {
        	rnum=(int)(Math.random()*25);
        	temp =arr[0];
        	arr[0]=arr[rnum];
        	arr[rnum]=temp;
        }
        //출력
        for(int i=0;i<arr.length;i++) {
         System.out.print(arr[i]+" ");
        }
		
		
		// 0,1 로 랜덤으로 숫자를 넣고싶다.
//		for(int i=0;i<arr.length;i++) {
//			int rnum=(int)(Math.random()*2); //0~1까지
//			arr[i]= rnum;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}

	}
}
