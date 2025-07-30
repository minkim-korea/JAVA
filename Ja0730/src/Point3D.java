
public class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		// super(); ->Point();
		super(x,y);//기본생성자가 없을경우 , 설정을해줘야함  
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return String.format("x: %d, y: %d, z: %d \n",x,y,z);
//		return "x: "+x+ ", y: "+y+", z:"+z;
		
	}
}
