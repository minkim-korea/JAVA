import java.io.File;
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("생성할 파일이름을 입력하세요 ");
		String fileName =scan.next();
		System.out.println("c:/down1/"+fileName);
		File f = new File("c:/down1/"+fileName);
		if (!f.exists()) {
			try {
				f.createNewFile(); //용량꽉차거나 하드가 에러 예외처리
			} catch (Exception e) {
				e.printStackTrace();
			}//파일생성이 됨. 
			System.out.println("파일이 생성되었습니다.");
		}else {
			System.out.println("파일이 존재합니다.");
		}
	}

}
