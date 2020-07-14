// Code reviewed by @professorgordon.
//Preston Boutsis
import java.util.Scanner;

public class Week4Assignment {

	public static void main(String[] args) {
		
		System.out.println("Please enter your box dimensions to calculate its surface area and volume:");

		double length=0;
		
		double width=0;
		
		double height=0;
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.printf("Enter the length: ", length);
		length = input1.nextDouble();
		
		System.out.printf("Enter the box width: ", width);
		width = input1.nextDouble();
		
		System.out.printf("Enter the box height : ", height);
		height = input1.nextDouble();
		
		System.out.println();
		
		System.out.printf("The surface area of your box is: %,.2f%n", surface(length, width, height));
		
		System.out.printf("The volume of your box is: %,.2f", volume(length, width, height));
	}
	
	private static double surface (double width, double length, double height) 
	{
		return 2*(length * width) + 2*(length * height) + 2*(width * height);
	}
	private static double volume (double length, double height, double width) 
	{
		return length * height * width;
	}
}

