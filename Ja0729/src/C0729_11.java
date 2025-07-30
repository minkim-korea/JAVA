
public class C0729_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stuscore s1 = new Stuscore();
		System.out.println(s1.no);// 1
		Stuscore s2 = new Stuscore();
		System.out.println(s2.no);// 2
		Stuscore s3 = new Stuscore("이순신", 100, 100, 99);
		System.out.println(s3.no);// 3
		Stuscore s4 = new Stuscore("강감찬", 90, 90, 99);
		System.out.println(s4.no);// 4
		// 배열선언
		Stuscore[] stu = new Stuscore[4]; // 배열선언
		// 객체선언 Stuscore stu = new Stuscore();
		// Stuscore stu[0] =new Stuscore();
		stu[0] = new Stuscore();
		stu[1] = new Stuscore();
		stu[2] = new Stuscore("이순신", 100, 100, 99);
		stu[3] = new Stuscore("강감찬", 90, 90, 99);

		System.out.println(stu[2].name);
		System.out.println(stu[3].name);

	}

}
