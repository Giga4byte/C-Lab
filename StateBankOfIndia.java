import java.util.*;
import java.io.*;

clas

class StateBankOfIndia {
    public static void main (String args[]) {
        double amt;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("W);
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

                        case 4: S
                                {  throw new InsufficientBalanceException("Insufficient funds!");  }
                                else
                                {  AccBal -= amt;  }
                                RecBal += amt;
                                System.out.println ("ACCOUNT BALANCE: ");
                                System.out.println ("Rs." + AccBal);
                                System.out.println();
                           
            } // try2 statement
            catch (Exception e) {
                // Handle specific exceptions or provide a generic message
                System.out.println("Error during ATM operation: " + e.getMessage());
   
