import java.util.Scanner;


class q9{
    
    public static void main (String[] args)
    {
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Enter your name:");
        
         String s_name=scanner.next();
        
        System.out.println("Enter your marks:");
        
        int s_marks=scanner.nextInt();
        
        System.out.println("you Entered"+s_name+""+s_marks);
        
        if(s_marks>=80 && s_marks <=100){
        System.out.println("Distinction ");
        }
        else if(s_marks>=70 && s_marks<79){
        System.out.println("Very good pass");
        }
        else if(s_marks>=60&& s_marks<69){
        System.out.println("Credit");
        }
        else if(s_marks>=50&& s_marks<59){
        System.out.println("Pass");
        }
        else if(s_marks<49 ){
        System.out.println("Fail");
        }
        
        else {
        System.out.println("invalid marks");
        }
    
}
}