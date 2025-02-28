import java.util.Scanner;

class Student {
	int idNo, noOfSubject;
	String subjectCode[];
	int subjectCredit[];
	String gradeObtained[];
	double spi;

	public Student(int idNo, int noOfSubject, String subjectCode[], int subjectCredit[], String gradeObtained[]) {
		this.idNo=idNo;
		this.noOfSubject=noOfSubject;
		this.subjectCode=subjectCode;
		this.subjectCredit=subjectCredit;
		this.gradeObtained=gradeObtained;
	}

	public void printDetail() {
		System.out.println("ID = " + idNo);
		System.out.println("noOfSubject = " + noOfSubject);
		for(int i=0; i<noOfSubject; i++) {
			System.out.println("subjectCode of Sub-"+(i+1)+" = " + subjectCode[i]);
			System.out.println("subjectCredit of Sub-"+(i+1)+" = " + subjectCredit[i]);
			System.out.println("gradeObtained of Sub-"+(i+1)+" = " + gradeObtained[i]);
		}
	}

	public void calculate_spi(){
		int totalCredit=0, totalPoint=0;
		for(int i=0; i<noOfSubject; i++) {
			int gradePoint=0;
			switch(gradeObtained[i]) {
				case "A++" :
					gradePoint=10;
				break;
				case "A+" :
					gradePoint=9;
				break;
				case "A" :
					gradePoint=8;
				break;
				case "B++" :
					gradePoint=7;
				break;
				case "B+" :
					gradePoint=6;
				break;
				case "B" :
					gradePoint=5;
				break;
				case "C" :
					gradePoint=4;
				break;
				case "D" :
					gradePoint=3;
				break;
				default :
					gradePoint=0;
				break;
			}
			totalCredit+=this.subjectCredit[i];
			totalPoint+=gradePoint * this.subjectCredit[i];
		}
		this.spi = (double)totalPoint/totalCredit;
		System.out.println("SPI for student with ID-" + idNo + ": " + spi);
	}

}

public class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Student : ");
		int n = sc. nextInt();

		Student[] s = new Student[n];

		for(int i=0; i<n; i++) {
			System.out.print("Enter student id : ");
			int studentId = sc.nextInt();
			System.out.print("Enter total subject: ");
			int totalSubject = sc.nextInt();
			String[] subCode = new String[totalSubject];
			int[] subCredit = new int[totalSubject];
			String[] grade = new String[totalSubject];
			System.out.println("Enter detais for student - " + studentId);
			for(int j=0; j<totalSubject; j++) {
				System.out.println("Enter detais for subject-"+(j+1));
				System.out.print("Enter subject code :");
				subCode[j] = sc.next();
				System.out.print("Enter subject crdit : ");
				subCredit[j] = sc.nextInt();
				System.out.print("Enter grade of subject : ");
				grade[j] = sc.next();
				System.out.println("=================================");
			}
			s[i] = new Student(studentId, totalSubject, subCode, subCredit, grade);
			s[i].calculate_spi();
			System.out.println("=================================");
		}
	}
}