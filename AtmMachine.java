import java.util.Scanner;
class ATM{
    float Balance;
    int PIN=6100;
    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int EnteredPin= sc.nextInt();
        if (EnteredPin==PIN){
            menu();
        }
        else {
            System.out.println("Enter a valid Pin:");
        }
    }
    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        Scanner sc=new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt==1){
            checkBalance();
        } else if (opt==2) {
            withdrawMoney();
        } else if (opt==3) {
            depositMoney();
        } else if (opt==4) {
            return;
        }
        else {
            System.out.println("Enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: " +Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money withdraw successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited successfully");
    }
}
public class AtmMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
