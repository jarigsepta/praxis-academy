import java.util.Scanner;

public class Program
{
 	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number");
int a = Integer.parseInt(scanner.nextLine());
if (a > 5)
        System.out.println("The number you entered is greater than 5!");
System.out.println("Thanks for the input!");
	}
}