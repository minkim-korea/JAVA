
public class C0728_06 {

	public static void main(String[] args) {
		// 다른 클래스 사용방법- 객체선언후 사용
		// 인스턴스 변수 사용방법
		// 객체선언후 사용 , 객체개별사용 ,참조변수명.변수명

		Card c = new Card();
		c.kind = "spade";
		c.number = 1;

		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 2;
		Card c3 = new Card();
		c3.kind = "spade";
		c3.number = 3;
// 52개 생성 객체선언 값을 입력시
		Card[] card = new Card[52];
	    Card.width = 100;
	    Card.height= 250;
	    
		String[] shape = { "spade", "heart", "diamond", "clover" };
		// spade heart diamond clover
		//객체선언후 값입력
		for (int i = 0; i <card.length; i++) {
		card[i] = new Card();
			
		card[i].kind = shape[i/13];// spade 13 heart13 diamond13 clover13
		card[i].number = i%13+1; // 1-13 1-13 1-13 1-13
         		}
	   System.out.println("card0 넓이 :"+card[0].width);
	   System.out.println("card1 넓이 :"+card[1].width);
	   System.out.println("card2 넓이 :"+card[2].width);
		
		
		
		
		//출력
		for (int i = 0; i <card.length; i++) {
		System.out.println(card[i].kind+","+card[i].number);

		}

		System.out.println("---------------------------------");
		for (int i = 0; i < 13; i++) {
			card[i] = new Card();
			for (int j = 0; j < shape.length; j++) {
				card[i].kind = shape[j];// spade 13 heart13 diamond13 clover13
				card[i].number = i + 1; // 1-13 1-13 1-13 1-13

				System.out.println(card[i].kind + card[i].number);
				
			}

		}
		
	
	}

}
