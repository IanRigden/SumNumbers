import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        int SumTotal = 0; //init to 0
        int i = 1; //hold the loop tally

        //Get the number to sum to
        Scanner reader = new Scanner(System.in);
        System.out.print("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        //Loop to sumTo inclusive
        while(i <= sumTo){
            System.out.println(i);
            SumTotal += i;
            i += 1;
        }

        //Output the total
        System.out.println("The sum total to " + sumTo + " is " + SumTotal);
    }
}
