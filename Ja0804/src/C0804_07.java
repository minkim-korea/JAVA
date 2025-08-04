import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C0804_07 {

	public static void main(String[] args) throws Exception {
		// 파일복사
		File f = new File("c:/aaa/a1.jpg");
		FileInputStream fis = new FileInputStream(f);
		// a2.jpg로 복사
		FileOutputStream fos = new FileOutputStream("c:/bbb/a2.jpg");

		while (true) {
			int read = fis.read();
			if (read == -1)
				break;
			fos.write(read);
		}
		fis.close();
		fos.close();

		System.out.println("파일복사 완료 !!");
//입출력 //stream 연결통로 
		// FileInputStream를이용한 문자출력
//		File f =new File("c:/aaa/a1.txt");
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			int read =0;
//			while( (read =fis.read()) != -1 ) {
//				System.out.print((char)read); //read : 문자변경 
//			}
//			System.out.println();
//			fis.close(); //파일을 닫아야 삭제도가능 
//			
//		} catch (Exception e){e.printStackTrace();}
//	System.out.println("프로그램 종료 ! ");
	}

}
