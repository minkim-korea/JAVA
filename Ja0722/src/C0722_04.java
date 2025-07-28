
public class C0722_04 {

	public static void main(String[] args) {
		double p = 123.5468777; // 소수점 4자리까지만 남기고 절사하시오.
		double s_p = (int) (p * 100000.0) / 100000.0;
		System.out.println(s_p);
		// round,floor,ceil 다똑같음
		// 소수점5자리 남기고 절사하시오.
		double d = Math.floor(p*100000.0)/1000000;
		System.out.println(d);
		
		//소수점 5자리에서 반올림해서 4자리까지 출력하시오. 
		double num = Math.round(p*10000)/10000.0;
        System.out.println(num);		
        
        //소수점 2자리에서 올림해서 1자리까지  출력하시오 
        double num2 = Math.ceil(p*10)/10.0;
        System.out.println(num2);
		
//		double pi = 3.141592; // 3.141만 출력 문자열로 바꾼후에 자른다음 다시 숫자로변경
//		double s_pi = (int)(pi * 1000.0 ) / 1000.0;// 3141.592
//		System.out.println(pi);
//		System.out.println(s_pi);
	}

}
