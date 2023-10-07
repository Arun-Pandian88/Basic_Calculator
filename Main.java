import java.io.*;
import java.util.Scanner;
 class Calculator{
    public static void basic_Calculator(){
        Scanner input = new Scanner(System.in);
        //enter the values
        System.out.println("Enter the Number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        //enter the operations
        System.out.println("Enter the Operators +,-,*,/");
        //operations craet in char
        char op = input.next().charAt(0);
        int  result = 0;
        //using switch class

        switch (op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result =num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("unexpected value");
        }
        System.out.println("The Final Result");
        System.out.println();
        System.out.println(num1 +" "+ op+" "+num2 +" "+"="+" "+result);


    }

}
public class Main {
    public static void main(String[] args) {
        //another class creat in object
        Calculator object = new Calculator();
        //method creat in object
        object.basic_Calculator();

    }
}