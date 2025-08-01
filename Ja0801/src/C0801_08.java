import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C0801_08 {

	public static void main(String[] args) {
		// list 순서 o ,중복 ㅇ
		// Set 순서 x 중복 x 2개테이블 합쳤을때 동일한 것은 1개만 입력되도록 할때
		HashSet set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(4);

		//Iterator 사용-1회성 
		Iterator it =set.iterator();// list,set 정석은 iterator사용해야함.
		while(it.hasNext()) { //hasNext()다음것이 있는지확인
			System.out.println(it.next());//next() 1개 가져옴 
		}
		System.out.println("-----------------------");
		Iterator it2 =set.iterator();
		while(it2.hasNext()) { //hasNext()다음것이 있는지확인
			System.out.println(it2.next());//next() 1개 가져옴 
		}
		
		ArrayList list =new ArrayList();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(1);
		Iterator it3 =list.iterator();
		System.out.println("-----------------------");
		while(it3.hasNext()) { //hasNext()다음것이 있는지확인
			System.out.println(it3.next());//next() 1개 가져옴 
		}//원래는 정석이 이거임 (for문쓰자).
		
		
		//순서가 없어서 for 문을 사용할 수 없음 .   
//		for(int i =0;i<set.size();i++) {
//		}
		
		
		
}

}
