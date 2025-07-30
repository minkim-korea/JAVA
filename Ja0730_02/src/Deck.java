
public class Deck {
	Card[] c = new Card[52];
	String[] shape = { "SPADE", "HEART", "DIAMOND", "CLOVER" };
	String[] c_shape = { "", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	Deck() {
		// 모양 ,번호부여
		for (int i = 0; i < 52; i++) {
			c[i] = new Card(i % 13 + 1, shape[i / 13]);
		}
	}// 생성자

//카드섞기 메소드 
	void shuffle() {
		Card temp = null;
		int rnum = 0;
		for (int i = 0; i < 300; i++) {
			rnum = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}

//카드 5장 출력메소드 
	public Card[] pick_5() {
		Card[] c_5 = new Card[5];
		for (int i = 0; i < c_5.length; i++) {
			c_5[i] = c[i];

		}
		return c_5;
	}

// 카드 1장 뽑기 메소드
	public Card pick(int index) {
		return c[index];
	}

	//전체카드 출력 
	void deck_print() {
		for(int i=0;i<52;i++) {
			  System.out.print(c[i].toString());
		}
	}
	
	
// 랜덤 카드 1장뽑기메소드
  public Card pick() {
	  int index =(int)(Math.random()*52);
	  return c[index];
  }
}
