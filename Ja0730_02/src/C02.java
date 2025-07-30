
public class C02 {

	public static void main(String[] args) {
		//모양,번호가 포함되어 있는 카드 52장을 생성 
	Deck d =new Deck();
	
	
	//카드섞기 
	 d.shuffle();
	d.deck_print();
	//카드 5장을 출력 
	 System.out.println("-----");
	 System.out.println("5장");
	 for(int i=0;i<5;i++) {
		 Card pick_5 = d.pick(i);
		 System.out.println(pick_5);		 
	 }
	//31번째 카드를 출력 
	 Card c1= d.pick(31);
	 System.out.println("-------");
	 System.out.println("[31번째카드]");
	 System.out.println(c1);
	//랜덤으로 카드한장을 출력 하시오
	Card c2 =d.pick();
	System.out.println("----");
	System.out.println("[랜덤 출력]");
	System.out.println(c2);
	
	
	
	
	}

}
