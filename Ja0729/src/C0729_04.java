
public class C0729_04 {

	public static void main(String[] args) {
		// 생성자
		Data1 d1 = new Data1();//에러가 없음.
		d1.value =50;
//		Data2 d2 =new Data2(); //에러가남 
		Data2 d2 =new Data2(5,7); //에러가남 -매개변수를 포함해야 에러가나지않음 . 
	}

}

class Data1 {
	Data1(){} //생성자 -기본생성자 자동생성 
	int value;

}

class Data2 {
	int value;
//	Data2(){} //기본생성자 -자동생성이안됨 수동으로해야함 . 
	Data2(int x,int y) { //매개변수가있는 생성자 , 전체생성자
		value = x;
	}
}