
public class StuScore {

	String name; //인스턴스
	int kor; 
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	
	void stuTotal() {
		total =kor +eng +math;
	}
	void stuAvg() {
		avg= total/3.0;
//		avg= (kor+eng+math)/3.0;
	}
}
