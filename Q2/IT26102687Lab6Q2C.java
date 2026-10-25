import java.util.Scanner;

public class IT26102687Lab6Q2C {
    public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	int count = 1 , number ;
	String allNumbers = " " ; 
	int total = 0;

		while(count<=10){
		System.out.println("Enter number " +count+ ": ");
		number = input.nextInt() ; 
		
		count++ ; 
		
		allNumbers = allNumbers + number +" " ;
		
		total= total + number;
		}
       System.out.println("\nThe numbers you entered are: " +"\n" + allNumbers);
	
		double avg = total/10 ;
		System.out.println("Sum of the numbers: " + total);
		System.out.print("Average of the numbers: " + avg);
    }
}