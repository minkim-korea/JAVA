
public class Stuscore {
	static int count =0;
	int no ;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	//초기화블럭
	{this.no =count+1;
	count++;}
	
	//기본 생성자
	Stuscore(){
	
	}
	Stuscore(String name, int kor ,int eng, int math){
		
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.total =kor+eng+math;
		this.avg =this.total/3.0;
	}
}
