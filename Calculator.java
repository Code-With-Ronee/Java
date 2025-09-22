import java.util.*;


public class Calculator{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = sc.nextDouble()
        
        System.out.print("Enter Operation (+, -, *, /): ");
        char ch = sc.next().charAt(0);
        
        double res;

        switch(ch){
            case '+':
                res = a+b;
            break;

            case '-':
                res = a-b;
            break;

            case '*':
                res = a*b;
            break;

            case '/':
                res = a/b;
            break;

            default:
                System.out.println("Invalid Input!");
            return;
        }

        System.out.println(a + " + " + b + " = " + res);
    }
}