
public class Student {
    String name;
    int kor, eng, math, total;
    double avg;
    int count;
 	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
 	
 
    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.avg = this.total / 3.0;
    }
}

