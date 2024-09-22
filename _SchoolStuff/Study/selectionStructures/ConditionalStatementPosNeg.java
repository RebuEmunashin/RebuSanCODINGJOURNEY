package _SchoolStuff.Study.selectionStructures;
import java.util.Scanner;
public class ConditionalStatementPosNeg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;


        System.out.println("Input a number: ");
        num = scan.nextInt();
        if (num > 0) {
            System.out.println("\n" + num + " is a Positive number.");
        } else if (num < 0) {
            System.out.println("\n" + num + " is a Negative number.");
        } else {
            System.out.println("Number is a Zero.");
        }

        System.out.println("Program terminates");
    }
}