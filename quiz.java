import java.util.Scanner;

public class quiz {
    static int count = 0; //it is static integer variable, it shows the score of quiz
    Scanner sc = new Scanner(System.in); //it is used gives a user input in java

    //it is a 1st function of java and it stores the 1st MCQ
    public void  quiz1(){
        //this was print the MCQ in terminel
        System.out.println("What is a correct syntax to print output?");
        System.out.println("A. System.out.println(\"Hello World\");");
        System.out.println("B. cout << \"Hello World\";");
        System.out.println("C. consol.log(\"Hello World\")");
        System.out.println("D. echo(\"Hello World\")");
        
        //This method returns the character at the specified index within the string.
        char ch = sc.next().charAt(0);
        //switch is used to choose one case
        switch (ch) {
            case 'A':
                count++;//this is incresed by 1.
                break;//this is break the loop
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            default://if case was not matched to user input, then it will execute default statement
                System.out.println("invalid choice!");
        }
    }
    
    public void quiz2(){
        System.out.println("2. Select the valid statement.");
        System.out.println("A. char[] ch = new char(5)");
        System.out.println("B. char[] ch = new char[5]");
        System.out.println("C. char[] ch = new char()");
        System.out.println("D. char[] ch = new char[]");
        char ch1 = sc.next().charAt(0);
        switch (ch1) {
            case 'A':
                break;
            case 'B':
                count++;
                break;
            case 'C':
                break;
            case 'D':
                break;
            default:
                System.out.println("invalid choice!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the quiz");
        System.out.println("________________________________________________");
        
        quiz q1 = new quiz();//it is colled function to main function
        q1.quiz1();
        q1.quiz2();
        System.out.println("your score is : "+ count);//it will shows the totle score
    }
}
