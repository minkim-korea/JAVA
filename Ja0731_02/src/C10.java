import java.util.ArrayList;
import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>(); // Student 객체를 담는 리스트
		// 사용법 add /remove /isEmpty /get index

		while (true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 등수처리");
			System.out.println("6. 이름정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();

			switch (choice) {
			case 1: // 입력
				System.out.println("[학생성적입력]");
				System.out.printf("%d번째 학생을 입력하세요", list.size() + 1);
				String name = scan.next();
				System.out.println("국어점수를입력하세요");
				int kor = scan.nextInt();
				System.out.println("영어점수를입력하세요");
				int eng = scan.nextInt();
				System.out.println("수학점수를입력하세요");
				int math = scan.nextInt();
				// 컬렉션 저장
				Student s = new Student(name, kor, eng, math);
				list.add(s);

				System.out.printf("%s 학생성적이 저장되었습니다. \n", name);
				System.out.println();
				break;
			case 2:
				System.out.println("[ 성적 출력 ]");
				for (Student stu : list) {
					System.out.printf("이름: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.2f\n", stu.name, stu.kor, stu.eng,
							stu.math, stu.total, stu.avg);
				}
				break;
			case 3:
				System.out.println("[ 성적 수정 ]");
				System.out.print("수정할 학생 이름을 입력하세요: ");
				String searchName = scan.next();
				boolean found = false;

				for (int i = 0; i < list.size(); i++) {
					Student stu = list.get(i);
					if (stu.name.equals(searchName)) {
						// 학생 찾음
						System.out.printf("[%s] 학생을 찾았습니다.\n", stu.name);

						System.out.print("수정 국어 점수: ");
						stu.kor = scan.nextInt();
						System.out.print("수정 영어 점수: ");
						stu.eng = scan.nextInt();
						System.out.print("수정 수학 점수: ");
						stu.math = scan.nextInt();

						stu.total = stu.kor + stu.eng + stu.math;
						stu.avg = stu.total / 3.0;

						System.out.println("성적이 수정되었습니다.");
						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
				}
				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			}// switch
		} // while

	}// main

}// class
