import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
     Scanner scan =new Scanner(System.in);
     StuDeck studeck =new StuDeck();
     ArrayList<Student> list =new ArrayList<Student>();
     int no=0,kor=0,eng=0,math=0,count=0,total=0,rank=0;
     String name;
     double avg ;
     String[] title = {
				"번호","이름","국어","영어","수학","합계","평균","등수"	
			};
     int[] score = new int[3]; //국어,영어,수학
     Student s = new Student();
     //파일읽어오기 
     FileReader fr =new FileReader("c:/aaa/student.txt");
     BufferedReader br = new BufferedReader(fr);
     while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			list.add(new Student(no,name,kor,eng,math,total,avg));
		}
		br.close();
		fr.close();
		System.out.println("[ c:/aaa/student.txt 파일 읽어오기 성공 ] ");
		System.out.println();
     
     while(true) {
    	 
    	 System.out.println("[학생성적프로그램]");
    	 System.out.println("1.성적입력");
    	 System.out.println("2.성적출력");
    	 System.out.println("3.이름정렬");
    	 System.out.println("4.등수처리");
    	 System.out.println("5.학생수정");
    	 System.out.println("6.파일저장");
    	 System.out.println("---------------");
    	 System.out.println("번호를입력해주세요");
    	 int choice= scan.nextInt();
    	 
    	 switch(choice) {
    	 case 1 ://성적입력
    		 System.out.println("[성적입력]");
    		 System.out.println("이름을입력해주세요");
    		 name= scan.next();
    		 for(int i=0;i<3;i++) {
    			 System.out.printf("%s 점수를 입력해주세요\n",title[i+2]);
    			 score[i]= scan.nextInt();
    		 }
    		 list.add(new Student(name,score[0],score[1],score[2]));
    			System.out.printf("%s 학생성적이 저장되었습니다!",name);
    			System.out.println();
    		
    		 break;
    	 case 2 : //성적출력
    		
    			System.out.println();
    			System.out.println("                     [ 학생성적 출력 ] ");
    			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
    					title[0],title[1],title[2],title[3],title[4],
    					title[5],title[6],title[7]
    					);
    			System.out.println("------------------------------------------------------------");
    			for(int i=0;i<list.size();i++) {
    				s = list.get(i); 
    				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
    						s.getNo(),s.getName(),s.getKor(),s.getEng(),
    						s.getMath(),s.getTotal(),s.getAvg(),s.getRank()
    						);
    			}
    			System.out.println();
    		 break; 
    	 case 3 : //이름으로정렬
    		 System.out.println("[이름으로 정렬]");
    			System.out.println(" 1.이름순차정렬");
    			System.out.println(" 2.이름역순정렬");
    			System.out.println("-----------------");
    			System.out.println("원하는 번호를 입력하세요.>>");
    	        choice= scan.nextInt();
    	        switch(choice){
    	        	case 1:
    	        		System.out.println("[이름 순차정렬]");
    	        		list.sort(new Comparator<Student>() {
    						@Override
    						public int compare(Student o1, Student o2) {
    							// o1 이 더크면 순서변경 
    							return o1.getName().compareTo(o2.getName());   
    						}
    					});
    	        		break; 
    	        	case 2:
    	        		System.out.println("[이름 역순정렬]");
    	        		list.sort(new Comparator<Student>() {
    						@Override
    						public int compare(Student o1, Student o2) {
    							// o1 이 더크면 순서변경 
    							return o2.getName().compareTo(o1.getName());  
    						}
    					});
    	        		break; 
    	        }//switch
    			
    		 break; 
    	 case 4 : // 등수처리 
    		 for(int i=0;i<list.size();i++) {
                    int count1 = 1; 
    			 for(int j=0;j<list.size();j++) {
    				 if(list.get(i).getTotal()<list.get(j).getTotal()) 
    					 count1++;
    				 list.get(i).setRank(count1);
    			 }
    		 }
    		 break;
    	 case 5 : //학생수정 
    		 break;
    	 case 6 : //파일저장 
    		 FileWriter fw = new FileWriter("c:/aaa/student1.txt");
    			BufferedWriter bw = new BufferedWriter(fw);
    			for(int i=0;i<list.size();i++) {
    				s = list.get(i);
    				String st = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n", 
    				s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
    				s.getTotal(),s.getAvg(),s.getRank());
    				bw.write(st);
    			}
    			bw.close();
    			fw.close();
    		 break; 
    	
    	 }
    	 
     }
     
     
     
     
     
     
}

}
