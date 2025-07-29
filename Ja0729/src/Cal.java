
public class Cal {
	
	//
	void calProcess(int a,int b,double[] number) {
		//더하기 빼기 곱하기 나누기 
		number[0] = a+b;
		number[1]=a-b;
		number[2]=a*b;
		number[3]=(double)a/b;
	}
	
	
	
	
	
	
	
	
	
//4칙연산 
	int result; //인스턴스변수 - 객체선언후 사용 ,객체 개별사용, 참조변수명.변수명 
 int  add(int a,int b) {
	result = a+ b; 
	return result;
}//add
 
 //minus
 int minus(int a, int b) {
	 result = a-b;
	 return result;
 } //minus
 
 //multi
 int multi(int a, int b ) {
	 result =a*b;
	 return result;
}//multi
 
 //sub
 void sub(int a, int b ,double result4) {
	result4 =(double)a/b;
	System.out.println("결과:"+result4);
 }//sub



}
