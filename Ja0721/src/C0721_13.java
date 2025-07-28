
public class C0721_13 {

	public static void main(String[] args) {
		int a = 10000000;
		int b = 20000000;
		long c = (long)a * (long)b;
//		long d = (long)a * b;
		System.out.println("c:" + c);
//		System.out.println("d:" + d);
		
		int d = 1000000;
		int e = 1000000;
		int f = (int)((long)d*e/e); 
		System.out.println("f:"+f);
		int g =d/e*e;
		System.out.println("e:"+e);
	}

}
