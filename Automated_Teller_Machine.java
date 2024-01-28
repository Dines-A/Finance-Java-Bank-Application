package Application;

import java.util.Scanner;

public class Automated_Teller_Machine {
    public static void main(String[] args) {
        StartProcess name = new StartProcess();
    }
}


class Transaction{

    private static double AccountBalance=10000,withdrawAmount,depositAmount;
    private String AccountHolder="Dinesh",AccountType="Salary";
    void Deposit()
    {
        System.out.println("Enter your Deposit amount : ");
        Scanner scanner = new Scanner(System.in);
        depositAmount = scanner.nextDouble();
        AccountBalance += depositAmount;
        System.out.println("Amount Deposited Successfully.. ");
    }
    void Withdraw()
    {
        System.out.println("Enter your Amount to Withdraw : ");
        Scanner scanner = new Scanner(System.in);
        withdrawAmount = scanner.nextDouble();
        AccountBalance -= withdrawAmount;
        System.out.println("Collect your cash... ");
    }
    void Statement()
    {
        System.out.println("Account holder name : "+AccountHolder);
        System.out.println("Account type : "+AccountType);
        System.out.println("Account balance : "+AccountBalance);
        System.out.println("Last withdraw amount :"+withdrawAmount);
        System.out.println("Last deposit amount "+depositAmount);
    }
}

class StartProcess{
    String BankName = "Java Finance Bank";
    int option;
    StartProcess()
    {
        System.out.println("Welcome to "+ BankName);
        Waiting.Wait();

        while (true)
        {
            System.out.println("Enter your PIN number : ");
            Scanner scanner = new Scanner(System.in);
            int userPin = scanner.nextInt();
            int systemPin = 5242;
            if (userPin == systemPin)
            {
                Processing.Process();
            while (true)
            {
                Waiting.Wait();
                System.out.println("Enter 1 for Deposit");
                System.out.println("Enter 2 for Withdraw");
                System.out.println("Enter 3 for Statement");
                System.out.println("Enter 4 for Exit");
                System.out.println("Enter option : ");
                option = scanner.nextInt();
                Transaction name = new Transaction();
                switch (option)
                {
                    case 1:
                        name.Deposit();
                        continue;
                    case 2:
                        name.Withdraw();
                        continue;
                    case 3:
                        name.Statement();
                        continue;
                    case 4:
                        System.out.println("Thank you come again");
                        break;
                    default:
                        System.out.println("Enter proper input");
                        continue;
                }
                break;
            }
            break;
            }
            else{
                System.out.println("Entered a wrong PIN number");
            }
        }
    }
}


class Waiting{
    static void Wait(){
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}

class  Processing{
    static void Process(){
        for (int i=1;i<2;i++)
        {
            System.out.print("processing...\r");
            try{
                Thread.sleep(1000);
            }
            catch (Exception E)
            {
                throw new RuntimeException(E);
            }
            System.out.print("\r");
            try{
                Thread.sleep(1000);
            }
            catch (Exception E)
            {
                throw new RuntimeException(E);
            }
        }
    }
}
