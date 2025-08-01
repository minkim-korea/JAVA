import java.util.Arrays;

public class C0801_05 {

	public static void main(String[] args) {

		// split 분리자를 통해 배열로 리턴
		String str = "홍길동,유관순,이순신,강감찬,김구";
		String[] name2 = str.split(",");
		System.out.println(Arrays.toString(name2));

		String str2 = "1,홍길동,100,100,100,300,100.0";
		// split으로 분리한 다음 student 객체로 선언을 해보세요
		// string -> int타입 ,Str타입 ,int타입 ....double타입으로 변경해서
		// 객체선언해서 진행함 .
		String[] title = str2.split(",");
		int stuNo = Integer.parseInt(title[0]);
		String name=title[1];
		int kor = Integer.parseInt(title[2]);
		int eng = Integer.parseInt(title[3]);
		int math = Integer.parseInt(title[4]);
		int total = Integer.parseInt(title[5]);
		double avg= Double.parseDouble(title[6]);
		//객체선언
		Student stu = new Student(stuNo,name,kor,eng,math);
		String[] title1 = { "번호", "이름", "국어", "영어", "수학", "합계", "평균" };
		System.out.println(Arrays.toString(title1));
		System.out.printf("%d\t%s\t %d\t %d\t %d\t %d\t %.2f \t",stu.getStuNo(),stu.getName(),stu.getKor(),stu.getEng(),stu.getMath(),stu.getTotal(),stu.getAvg());

//	 //trim 빈공백제거 왼쪽오른쪽공백만(사이공백안됨)
//		String str ="   abc    c";
//		System.out.println(str);
//		System.out.println(str.trim());
//		
//		//replace 대체 (모든공백제거가능)
//		System.out.println(str.replace(" ",""));
//		//replace - " "을 ""대체 전체공백을 제거하는 형태 
//        

//		String str = "cccccccccccccccccccccccccccccccccc";
////c가 몇개있는지 출력하시오.  .indexOf("c",0); 연산자 를사용해서
//		int n =0;
//		int count=0;
//		while(true) {
//			n=str.indexOf("c",n);
//			if(n!=-1) {
//				System.out.println(n);
//				n++;
//				count++;
//				
//			}else {
//				System.out.println("종료");
//				break;
//			}
//		}
//	System.out.println("개수 :"+count);

	}

}
