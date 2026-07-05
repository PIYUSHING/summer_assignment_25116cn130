//  Bank account system
import java.util.Scanner;
import java.util.ArrayList;
class Account{
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
    public String getname(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited");
    }
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Amount Withdawn");
    }
    public void display(){
        System.out.println("==== Account Details ====");
        System.out.println("Account No            :- " + accountNumber);
        System.out.println("Account holder's Name :- " + name);
        System.out.println("Balance               :- " + balance);
        System.out.println("---------------------------");
    }
}
class Bank{
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account Successfully Added");
    }
    public Account searchAccount(int accountNumber){
        for(Account ac : accounts){
            if(ac.getAccountNumber() == accountNumber){
                return ac;
            }
        }
        return null;
    }
    public void displayAccount(int accountNumber){
       Account accc  = searchAccount(accountNumber);
       accc.display();
    }
    public void depositAccount(int accountNumber, double amount){
       Account accc  = searchAccount(accountNumber);
       accc.deposit(amount);
    }
    public void withdrawAccount(int accountNumber, double amount){
       Account accc  = searchAccount(accountNumber);
       accc.withdraw(amount);
    }
}
public class program_110 {
    public static void main(String[] args){
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----WELCOME TO BANK-----");
        boolean isMain = true;
        while(isMain){
           System.out.println("**Choose the Options below**");
           System.out.println("1.  Add Account"); 
           System.out.println("2.  Have an Account");
           System.out.println("3:  Exit ");
           int choice = scanner.nextInt();
           switch(choice){
            case 1:
                System.out.print("Enter Account Number :- ");
                int accNum = scanner.nextInt();
                System.out.println("Enter name :- ");
                String name = scanner.next();
                bank.addAccount(new Account(accNum, name, 0));
                System.out.println("Account Successfully Added");
                System.out.println("Return to main menu to deposite Balance");
                System.out.println("------THANKYOU------");
                break;
            case 2:
                System.out.println("Enter your Account Number :- ");
                int accNum2 = scanner.nextInt();
                Account ac = bank.searchAccount(accNum2);
                if(ac != null){
                    System.out.println("Account Found");
                    boolean secondloop = true;
                    while(secondloop){
                        System.out.println("===== Account No. - "+ accNum2 + " =====");
                        System.out.println("1.  Display Account");
                        System.out.println("2.  Deposite ");
                        System.out.println("3.  Withdraw");
                        System.out.println("4.  Exit");
                        int choice2 = scanner.nextInt();
                        switch(choice2){
                            case 1:
                                bank.displayAccount(accNum2);
                                break;
                            case 2:
                                System.out.print("Enter Amount :- ");
                                double amountDeposit = scanner.nextDouble();
                                bank.depositAccount(accNum2, amountDeposit);
                                break;
                            case 3:
                                System.err.print("Enter Amount :- ");
                                double amountWithdraw = scanner.nextDouble();
                                bank.withdrawAccount(accNum2, amountWithdraw);
                                break;
                            case 4:
                                secondloop = false;
                                break;

                        }
                    }
                }
                else{
                    System.out.println("Account not Available");
                    break;
                }
                break;
            case 3:
                isMain = false;
                break;
           }
        }
        scanner.close();
    }

}
