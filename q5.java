import java.util.Scanner;
public class q5 {

    public static void main(String[] args) {
	//question_05
	int a;
	int b;
	int c;
	Scanner input = new Scanner(System.in); 
	System.out.println("enter your first number:");
               a=input.nextInt();
        System.out.println("enter your second number:");
        b=input.nextInt();
        c=a+b;
        System.out.println("The sum of"+a+"and"+b+"is"+c);
	
    }
}

