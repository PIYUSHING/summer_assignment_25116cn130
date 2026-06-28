import java.util.*;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }else{
            this.balance = 0;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void deposit (double amount){
        if(amount >= 0){
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        }
        else{
            System.out.println("invalid input");
        }
    }
    public void withdraw(double amount){
        if(amount >= 0 && amount <= balance){
            balance -= amount;
            System.out.println("successfully withdrawn "+ amount);
        } 
        else if(amount > balance){
            System.out.println("insufficient balance");
        }
        else{
            System.out.println("invalid input");
        }
    }
}
public class program_103{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00;
        BankAccount userAccount = new BankAccount(balance);
        boolean running = true;
        while(running){
            System.out.println("\n ---- welcome to ATM ----");
            System.out.println("1. check balance");
            System.out.println("2. deposit amount");
            System.out.println("3. withdraw amount");
            System.out.println("4. Exit");
            System.out.println("Emter your choice");

            if(!scanner.hasNextInt()){
                System.out.println("invalid choice");
                scanner.nextInt();
                continue;
            }
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("balance :- " + userAccount.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount");
                    if(scanner.hasNextDouble()){
                        double depositamount = scanner.nextDouble();
                        userAccount.deposit(depositamount);
                    }
                    else{
                        System.out.println("invalid amount");
                        scanner.next();
                    }
                    break;
                case 3:
                    System.out.println("Enter amount");
                    if(scanner.hasNextDouble()){
                        double withdrawamount = scanner.nextDouble();
                        userAccount.withdraw(withdrawamount);
                    }
                    else{
                        System.out.println("invalid amount");
                        scanner.next();
                    }
                    break;
                case 4:
                    System.out.println("Thaknyou for using ATM");
                    running = false;
                    break;
                default :
                    System.out.println("invalid input");
                    break;
            }  
        }
        scanner.close();
    }
}