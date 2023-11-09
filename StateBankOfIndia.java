import java.util.*;
import java.io.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class StateBankOfIndia {
    public static void main (String args[]) {
        double amt;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Welcome to State Bank of India ATM");
            System.out.println();
            System.out.println("Enter your account number: ");
            String AccNo = s.nextLine();

            try (FileWriter fwriter = new FileWriter(AccNo + ".txt")) {
                fwriter.write(AccNo);
            } catch (IOException e) {
                System.out.println("Error writing to the file: " + e.getMessage());
            }
            try {
                System.out.print("Enter the balance: Rs.");
                double AccBal = s.nextDouble ();
                System.out.println();
                System.out.println("\nState Bank of India Menu:");
                System.out.println("1. View Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Transfer Money");
                System.out.println("5. Exit");
                System.out.println();

                while (true)
                {
                    System.out.print ("Enter the choice: ");
                    int choice = s.nextInt ();

                    switch (choice) {
                        case 1: System.out.println ("ACCOUNT BALANCE: ");
                                System.out.println ("Rs." + AccBal);
                                System.out.println();
                                break;

                        case 2: System.out.print ("Enter the amount to deposit: Rs.");
                                amt = s.nextDouble ();
                                AccBal += amt;
                                System.out.println ("ACCOUNT BALANCE: ");
                                System.out.println ("Rs." + AccBal);
                                System.out.println();
                                break;

                        case 3: System.out.print ("Enter the amount to withdraw: Rs.");
                                amt = s.nextDouble ();
                                if (amt > AccBal) 
                                {  throw new InsufficientBalanceException("Insufficient funds!");  }
                                else
                                {  AccBal -= amt;  }
                                System.out.println ("ACCOUNT BALANCE: ");
                                System.out.println ("Rs." + AccBal);
                                System.out.println();
                                break;

                        case 4: System.out.println ("Enter recipient account number: ");
                                s.nextLine();
                                String RAccNo = s.nextLine ();
                                double RecBal = 89000.00;
                                System.out.print ("Enter the amount to transfer: Rs.");
                                amt = s.nextDouble ();
                                if (amt > AccBal) 
                                {  throw new InsufficientBalanceException("Insufficient funds!");  }
                                else
                                {  AccBal -= amt;  }
                                RecBal += amt;
                                System.out.println ("ACCOUNT BALANCE: ");
                                System.out.println ("Rs." + AccBal);
                                System.out.println();
                                /*System.out.println ("RECIPIENT'S BALANCE: ");
                                System.out.println ("Rs." + RecBal);*/
                                System.out.println();
                                break;
                        case 5: System.out.println("TERMINATING");
                                return;
                        default: System.out.println("Invalid choice.");
                    } // switch statements
                }
            } // try2 statement
            catch (Exception e) {
                // Handle specific exceptions or provide a generic message
                System.out.println("Error during ATM operation: " + e.getMessage());
            }
        }
        catch (Exception e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
