import java.util.*;
public class ATM {
    public static long Withdraw_Amount,Bank_balance;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println();
            System.out.println("1.Withdraw \n2.Deposit \n3.Bank Balance \n4.Exit Transaction \nEnter your choice : ");
            int n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the Money to withdraw");
                    Withdraw_Amount=sc.nextLong();
                    if(Withdraw_Amount>Bank_balance){
                        System.out.println("you don't have enough money to withdraw");
                    }
                    else{
                        Bank_balance-=Withdraw_Amount;
                        System.out.println("Successfully Withdrawn");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount to Deposit");
                    long k=sc.nextLong();
                    Bank_balance+=k;
                    System.out.println("Successfully Deposited");
                    break;
                case 3:
                    System.out.println("Bank Balance : "+Bank_balance);
                    break;
                case 4:
                    System.out.println("Thank You Visit Again");
                    return;
            }
        }
    }
}
