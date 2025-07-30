
public class C01 {

	public static void main(String[] args) {
		// 배열 5개를 선언
		// for문 사용해서
		// 1:1:1 ,2:2:2, .....5:5:5
		// 출력하시오.
      Time[] t = new Time[5];
      //t[0]=new Time(1,1,1);
      for(int i=0;i<5;i++) {
    	t[i]=new Time(i+1,i+1,i+1);
    	System.out.println(t[i]);
    	//t[1]= 12 : 59 30;     	
      }
      
      t[1].setHour(12);
      t[1].setMinute(59);
      t[1].setSecond(30);
      
      System.out.printf("%d시%d분%d초",t[1].getHour(),t[1].getMinute(),t[1].getSecond());
      
//     Time t1 =new Time(10,10,10);
//     Time t2 =new Time();
//     t2.setHour(11);
//     t2.setMinute(11);
//     t2.setSecond(11);
//	System.out.println(t1);
//	System.out.println(t2);

	}

}
