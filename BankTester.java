// Tester class that creates and updates bank accounts
public class BankTester {
   public static void main(String[] args) {
	BankAccount Alex = new BankAccount("Alex", 100.0);
	BankAccount Jamie = new BankAccount("Jamie", 250.0);

		Alex.deposit(50.0);
		Alex.printInfo();
		Jamie.printInfo();

   }
}

class BankAccount {
   private String owner;
   private double balance;
 
   public BankAccount(String o, double b) {
      owner = o;
      balance = b;
   }
 
   public void deposit(double amount) {
      balance = balance + amount;
   }
 
   public void printInfo() {
      System.out.println(owner + " — Balance: $" + balance);
   }
}

