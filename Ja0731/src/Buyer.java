
public class Buyer {

	String id;
	String pw;
	String name;
	String address;
	int money ;//보유금액 
	int bonusPoint;//보너스포인트
	
	Product[] cart =new Product[10]; //산목록넣기 
	int i;//cart
	Buyer(){}
	
	Buyer(String id,String name, int money, int bonusPoint){
		this.id =id;
		this.name=name;
		this.money=money;
		this.bonusPoint=bonusPoint;
	}
	void buy(Product t) {
		money -=t.price;
		bonusPoint +=t.bonusPoint;
	    cart[i++] = t;
	    
	}
}
