
import java.util.Scanner;

/**
 * quiz
 */
public class quiz {
    static int count = 0;
    Scanner sc = new Scanner(System.in);

    public void  quiz1(){
        System.out.println("What is a correct syntax to print output?");
        System.out.println("A. System.out.println(\"Hello World\");");
        System.out.println("B. cout << \"Hello World\";");
        System.out.println("C. consol.log(\"Hello World\")");
        System.out.println("D. echo(\"Hello World\")");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A':
                count++;
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            default:
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
        
        quiz q1 = new quiz();
        q1.quiz1();
        q1.quiz2();
        System.out.println("your score is : "+ count);
    }
}