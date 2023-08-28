
import java.util.Scanner;

public class Lab_1 {
    public static double result=0;
    public static double intPower(double x, int n){
        if(n<0){
            System.out.println("Here n is Negative.");
            result = 1/(Math.pow(x, -n));
        } else if (n>0 && n%2==0) {
            System.out.println("Here n is Positive and Even.");
            result = Math.pow((Math.pow(x,n)/2), 2);
        } else if (n>0 && n%2!=0) {
            System.out.println("Here n is Positive and Odd.");
            result = Math.pow(x, n-1) * x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please Enter x :");
        double first = scn.nextInt();
        System.out.println("Please Enter n :");
        int second = scn.nextInt();

        System.out.println("Result is: " + intPower(first, second));
    }
}