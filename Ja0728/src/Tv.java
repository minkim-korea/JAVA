
public class Tv {
	C0728_01 c =new C0728_01();
	
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;

	}

	void channelUp() {
		channel++;

	}

	void channeDown() {
		channel--;
	}

}
