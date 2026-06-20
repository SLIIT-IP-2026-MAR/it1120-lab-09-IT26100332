import java.util.Scanner;
public class IT26100332Lab9Q1{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);	
	
	System.out.print("Enter value a: ");
	double aValue = sc.nextDouble();
	
	System.out.print("Enter value b: ");
	double bValue = sc.nextDouble();
	
	System.out.print("Enter value c: ");
	double cValue = sc.nextDouble();
	
	double xValueRoot1 = -((bValue)-Math.sqrt(Math.pow(bValue,2)-4.0*aValue*cValue))/(2.0*aValue);
	double xValueRoot2 = -((bValue)+Math.sqrt(Math.pow(bValue,2)-4.0*aValue*cValue))/(2.0*aValue);
	
	
	System.out.println();
	System.out.println("Roots are real and different :");
	
	System.out.printf("Root 1: %.2f",xValueRoot1);
	System.out.println();
	System.out.printf("Root 2: %.2f ",xValueRoot2);
	
	
	
	
	
	
	
	
	}
}