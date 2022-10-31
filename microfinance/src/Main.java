import javax.script.ScriptEngineManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to ACT Microfinance");
        Scanner scan = new Scanner(System.in);
        System.out.println(" For Loan Press 1 / For Info Press 2 ");
        byte press = scan.nextByte();
        if (press == 1) {
            System.out.println("Enter your Name ?");
            String name = scan.next();
            System.out.println("please insert your saving Amount  ");
            float savingInput = scan.nextFloat();
            System.out.println("please insert How long have you been saving  ");
            int monthInput = scan.nextInt();
            if (monthInput < 6) {
                System.out.println("Loan not allowed since you haven't fulfilled requirement of more than 6 month");
            } else {
                System.out.println("do you have criminal record ans:yes/no ");
            }
            String criminalRecordInput = scan.next();
            if (criminalRecordInput.equalsIgnoreCase("yes")) {
                System.out.println("Loan not allowed since you have criminal record");
            } else {
                System.out.println("please insert your loan Amount  ");
            }
            double loanInput = scan.nextDouble();
            double loan = loanInput * 0.25;
            if (savingInput < loan) {
                System.out.println("Loan not allowed since you don't have enough saving");
            } else {
                System.out.println("please insert When will you pay  ");
            }
            int yearInput = scan.nextInt();
            double interest = yearInput * loanInput * 0.15;
            System.out.println(interest);
            System.out.println("do you accept interest ans:yes/no ");
            String interestInput = scan.next();
            if (interestInput.equalsIgnoreCase("no")) {
                System.out.println("Loan not allowed since you don't accept interest");
            } else {
                System.out.println("do you have collateral ans:yes/no ");
            }
            String collateralInput = scan.next();
            if (collateralInput.equalsIgnoreCase("no")) {
                System.out.println("Loan not allowed since you don't have collateral ");
            } else {
                System.out.println("Loan Approved");
            }
        }
        else if (press == 2){
            System.out.println("Information to get loan");
            System.out.println("No Criminal Record");
            System.out.println("Saving Amount should be >= to 25 % of loan Amount");
            System.out.println("You should know whether you are cable of paying interest annually");
            System.out.println("Should have collateral");
        }
    }
}