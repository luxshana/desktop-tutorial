import java.util.Scanner;
public class q4 {

    public static void main(String[] args) {
	//question_04
	String name;
	int age;
	Scanner input = new Scanner(System.in); 
	System.out.println("enter your name:");
	System.out.println("enter your age:");
	name = input.next();
	age=input.nextInt();
	System.out.println("Hello "+name+"!!"+"you are"+age+"years old!");
	
    }
}