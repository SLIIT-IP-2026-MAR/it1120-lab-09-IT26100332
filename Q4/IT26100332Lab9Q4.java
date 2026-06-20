import java.util.Scanner;
public class IT26100332Lab9Q4{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	
	String studentsArray[] = new String[5];
	double assignmentMarkArray[] = new double[5];
	double examPaperMarkArray[] = new double[5];
	double finalMarkArray[] = new double[5];
	char gradeArray[] = new char[5];
	
	for(int i=0; i<5; i++){
		System.out.print("Enter Name of Student "+(1+i)+": ");
		studentsArray[i] = sc.nextLine();
		
		
		System.out.print("Enter Assignment Mark (out of 100) for "+studentsArray[i]+": ");
		assignmentMarkArray[i] = sc.nextDouble();
		
		System.out.print("Enter Exam Paper Mark (out of 100) for "+studentsArray[i]+": ");
		examPaperMarkArray[i] = sc.nextDouble();
		
		System.out.println();
		
		finalMarkArray[i] = calcFinalMark(assignmentMarkArray[i] , examPaperMarkArray[i]);
		gradeArray[i] = findGrades(finalMarkArray[i]);
		
		sc.nextLine();
	}
	
	System.out.println();
	System.out.println("Name\t\tFinal Mark\tGrade");
	
	for(int j=0; j<5; j++){
		printDetails(studentsArray[j], finalMarkArray[j], gradeArray[j]);
	}
}
	
	
	public static double calcFinalMark(double assignmentMarkArray , double examPaperMarkArray){
		return (assignmentMarkArray*0.3)+(examPaperMarkArray*0.7);
	}

	public static char findGrades(double finalMarkArray){
		if(finalMarkArray>=75){
			return 'A';
		}
		
		else if(finalMarkArray>=60 && finalMarkArray<75){
			return 'B';
		}
		
		else if(finalMarkArray>=50 && finalMarkArray<60){
			return 'C';
		}
		
		else{
			return 'F';
		}
	}

	public static void printDetails(String studentsArray, double finalMarkArray, char gradeArray){
		System.out.println(studentsArray + "\t\t" + String.format("%.2f",finalMarkArray) + "\t\t" + gradeArray);
	}


}