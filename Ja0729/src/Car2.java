
public class Car2 {

	String color;
	String gearType;
	int door;
	
	// 객체선언 초기화메소드 선언 {} 없으면 호출  
	//생성자-인스턴스  클래스명이랑동일 리턴없다.
	Car2(){}
  //생성자 
	Car2(String color,String gearType, int door){
	//생성자-메소드
	this.color =color;
	this.gearType = gearType;
	this.door =door;
}
		
}