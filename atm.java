import java.util.Scanner;
public class atm {
    public static void main(String args[]){
         System.out.println("HELLO USER WE WELCOME YOU TO THIS ATM");
        bankAccount acc=new bankAccount();
        do{
        
        System.out.println("please choose an option");
        System.out.println("1.deposit");
        System.out.println("2.withdraw");
        System.out.println("3.check balance");
        System.out.println("4.exit");
        System.out.println();
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        switch(choice){
            case 1: 
                System.out.println("enter depositing ammount");
                int x=scan.nextInt();
                acc.deposit(x);
                break;
            case 2:
                System.out.println("enter withdraw amount ");
               int y=scan.nextInt();
                acc.withdraw(y);
                break;
            case 3:
                System.out.println("check balance");
                acc.checkBalance();
                break;
            case 4:return;
            default: System.out.println("invalid choice");
            }
        }while(true);

    }
    
}
class bankAccount{
    int balance=0;
    void deposit(int newBalance)
    {
        balance=balance+newBalance;
    }
    void withdraw(int yy)
    {
        if(yy>balance){
            System.out.println("insufficient balance");
        }
        else
        {
        balance=balance-yy;
        }
    
    }
    void checkBalance(){
        System.out.println("your balance is "+balance);
    }
}