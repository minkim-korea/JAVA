
public class Car {
	String color;
	String gearType;
	int door;

	Car() {
//		color ="white";
//		gearType ="auto";
//		door=5;
		this("white","auto",5);//다른생성자를 지정할때 this()
		door =5; //
	} // 기본생성자 -자동생성

	Car(String color, String gearType, int door) {
		//인스턴스변수 지정 
		this.color = color; //this 인스턴스변수를가리킴  
		this.gearType = gearType;
		this.door = door;
	}
	
	//객체를 매겨변수로 받음 
	Car(Car c){
		//다른 생성자 호출
		this(c.color,c.gearType,c.door);
//		color =c.color;
//		gearType =c.gearType;
//		door =c.door;
	}
	
	
	
}
