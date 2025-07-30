
public class Card {
	private int number;
	private String kind;
	private String[] c_shape = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"
};
	
Card(){}
Card(int number,String kind){
	this.number=number;
	this.kind=kind;
}
//getter, setter 를 생성 
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;

	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;

	}



	
	
	
	
	
	@Override
	public String toString() {
		return String.format("%d %s\n",number,kind);

	}

}
