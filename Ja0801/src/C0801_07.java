import java.util.ArrayList;
import java.util.List;

public class C0801_07 {

	public static void main(String[] args) {
		// 컬렉션 여러객체를모아둔것
		// List 순서가있고 중복허용 (ArrayList) vector
		// Set 순서가없고 중복허용안함
		// Map (key와value) 순서가없고 키중복은안되고 값은 중복이됨 HashMap

		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		// 숫자 3 삭제 됨.
//		list.remove(2);
		for (int i=list.size()-1;i>=0;i--) {
			list.remove(i);  //모두삭제 
		}//삭제하는방법 뒤에서부터 삭제하면됨 . 거꾸로안지우면 주소가지워지는동시에 옮겨져서 살아남는 애들이생김 
		
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		

//		Student s =new Student(1,"홍길동",100,100,100);
//		ArrayList<Student> list2 =new ArrayList<Student>();//학생성적프로그램때사용
//		
//		
//		//제너릭 - 특정 객체만 입력가능하도록 제어
//		//<> 제너릭(Generic) 이점 : 형변환 안해도됨 출력에 person사용하던거 안써도됨 
//	    ArrayList<Person> list =new ArrayList<Person>();
//	    Person p1 = new Person(10000,"홍길자");
//	    list.add(p1);
//	    list.add(new Person(10001,"홍길동")); //바로집어넣는걸 더많이사용 
//	    list.add(new Person(10007,"유관순"));
//	    list.add(new Person(10005,"강감찬"));
//	    list.add(new Person(10006,"김구"));
////	    list.add(s);//불가능 출력때에러남 오브젝트엔 아이디가없으므로 
//	    list.add(new Person(10008,"홍길동"));
//	    list.add(new Person(10002,"유관순"));
//	    list.add(new Person(10003,"이순신"));
//		
//		//id 출력 
//	    for(int i=0;i<list.size();i++) {
////	    	System.out.println(list.get(i));
//    	System.out.println((list.get(i)).id+ ","+(list.get(i)).name);
//	    }
//	    System.out.println("---------------------------------");
//	    //id : 10006번을 삭제후  전체출력 
////	    list.remove(4);
////	    for(int i=0;i<list.size();i++) {
////	    	System.out.println(list.get(i));
////	    }
//
//	     for(int i=0;i<list.size();i++) {
//	    	 if(( (Person)list.get(i) ).id == 10006) {
//	    		 list.remove(i);//삭제 
//	    		 break; //if문은 break없음 
//	    	 }
//	     }
//	     for(int i=0;i<list.size();i++) {
////		    	System.out.println(list.get(i));
//	    	System.out.println(((Person)list.get(i)).id+ ","+((Person)list.get(i)).name);
//		    }
//
//	    
//	    

		// list
//		ArrayList list =new ArrayList(); 
//		list.add(1); // 타입 : 기본형타입이 ->Integer객체타입 변경 -> wrapper 클래스  
//		list.add(2); //추가 add 
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(3);
//		list.add(5);
//        //출력 		
//		//크기 size()
//		for (int i=0;i<list.size();i++) {
//			//읽기 - get()
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("----------------------------");
//		//삭제 - remove()
//		list.remove(6);
//		
//		for (int i=0;i<list.size();i++) {
//		System.out.println(list.get(i));
//		}
//		System.out.println("----------------------------");
//		//모두삭제 -clear()
//         list.clear();
//     	for (int i=0;i<list.size();i++) {
//    		System.out.println(list.get(i));
//    		}
//		      

//		ArrayList list = new ArrayList();
//		List list2 =new ArrayList();

	}

}
