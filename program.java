import java.util.Scanner;
public class program{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum;

        int num1;
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt(); 

        int num2;
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt(); 
        

        sum = num1 + num2;
        System.out.println("Addition: " + sum);
   
}
}