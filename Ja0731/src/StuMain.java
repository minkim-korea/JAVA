import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck stuDeck= new StuDeck();
		ArrayList list = new ArrayList(); // 컬렉션으로 진행 자동늘려짐 //add /remove /isEmpty /get index 
		//Stuscore[] s =new Stuscore[10]; 예전방식 배열  안늘어남
		
		
		 
		while(true) {
		    int choice =stuDeck.menu_print();//상단메뉴 출력메소드
			switch(choice) {
			case 1:
				//학생성적입력 메소드
				stuDeck.stu_input(list);
				 break;
			case 2 :
				//학생성적출력 메소드  
				stuDeck.stu_output(list);
				 break;
			case 3 :
				break;
			}//switch
		}//while

		
	}//main 

}//class
