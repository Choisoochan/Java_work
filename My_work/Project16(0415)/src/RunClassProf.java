import java.util.Arrays;
import java.util.Random;

public class RunClassProf {
	public static void main(String[] args) {
		Random rand = new Random();
		
		StudentDataProf[] student = new StudentDataProf[10];
		for(int i = 0; i < student.length; i++) {
			student[i] = new StudentDataProf();
		}
		
		for(int i= 0; i< student.length; i++) {
			student[i].name = (i + 1) + "번 학생";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
		}
		
		for(int i= 0; i< student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
			
		}
//		Arrays.sort(student);
		for(int i = 0; i<student.length; i++) {
			for(int j = i; j < student.length; j++) {
				if(student[i].total < student[j].total) {
					StudentDataProf tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
		}
		for(int i = 0; i< student.length; i++) {
			System.out.println(student[i].print());
		}

	}
}
