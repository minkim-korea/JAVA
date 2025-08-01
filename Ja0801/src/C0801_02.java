import java.io.File;

public class C0801_02 {

	public static void main(String[] args) throws Exception {
	    String folder ="c:/aaa/";
		File fo = new File(folder);
		if(!fo.exists()) {
			fo.mkdirs();//폴더생성
	    System.out.println("폴더 생성");
		}
		
		File f = new File("C:/aaa/aabb.txt");
		f.createNewFile(); //에러가 남 .
		System.out.println("파일이 생성되었습니다.");
		System.out.println("프로그램이 종료되었습니다.");
		
	
//		File f = new File("C:/down1/abc.txt");// 폴더 ,파일에 대한처리 객체
//		//파일생성메소드 -try ~ catch
//		try {
//			f.createNewFile(); 
//		} catch (Exception e) {
//			e.printStackTrace();
//		} // 파일생성
//       System.out.println("프로그램이 종료되었습니다.");
//	}

}
}