import java.util.Scanner;

class customer{
    int cid;
    String cname;
    void getdata(Scanner sc){
        System.out.println("enter the customer id :");
        cid=sc.nextInt();
        System.out.println("enter the customer name :");
        cname=sc.nextLine();
        sc.nextLine();
    }
    void displayd(){
        System.out.println("the customer id :"+cid);
        System.out.println("the customer name :"+cname);
        
    }
}
class bankaccount{
    int accno;
    String acctyp;
    float balance;

    void get(Scanner sc){
        System.out.println("enter the account number :");
        accno=sc.nextInt();
        System.out.println("enter the account type :");
        acctyp=sc.nextLine();
        sc.nextLine();
        System.out.println("enter the balance :");
        balance=sc.nextFloat();
    }

    void working(Scanner sc){
        System.out.println("------Welcome to the bank------");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        int ch;
        do{
            System.out.println("Enter your choice :");
        ch=sc.nextInt();
        if(ch==1){
            System.out.println("Enter the amount to deposit :");
            float amt=sc.nextFloat();
            balance+=amt;
            System.out.println("Amount deposited successfully.");
        }
        else if(ch==2){
            System.out.println("Enter the amount to withdraw :");
            float amt=sc.nextFloat();
            if(amt<=balance){
                balance-=amt;
                System.out.println("Amount withdrawn successfully.");
            }
            else{
                System.out.println("Insufficient balance.");
            }
        }
        else if(ch==3){
            System.out.println("Current balance :"+balance);
        }
        else if(ch==4){
            System.out.println("Thank you for using our services.");
        }
        else{
            System.out.println("Invalid choice.");
        }
        }
        while(ch!=4);

    }

}
public class Bank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        customer c1=new customer();
        c1.getdata(sc);
        bankaccount b1=new bankaccount();
        b1.get(sc);
        c1.displayd();
        b1.working(sc);
        sc.close();
    }
}