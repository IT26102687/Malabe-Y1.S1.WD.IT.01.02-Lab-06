import java.util.Scanner;

public class IT26102687Lab6Q2B {
    public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	int count = 1 , number ;
	String allNumbers = " " ; 

		while(count<=10){
		System.out.print("Enter number " +count+ ": ");
		number = input.nextInt() ; 
		
		count++ ; 
		
		allNumbers = allNumbers + number +" " ;
		}
       System.out.println("\nThe numbers you entered are: " +"\n" + allNumbers);

    }
}