public class Bank {
    public static final int Balance = 0;
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int Balance;
        System.out.print("Enter your account balance: ");
        Balance = scanner.nextInt();
        void deposit(int amount) {
            int Balance = Balance+ amount;
        }
        void withdraw(int amount) {
            if (amount <= Balance) {
                int Balance = Balance - amount;
            } else {
                System.out.println("Insufficient funds.");
            }
        }
        void checkBalance() {
            System.out.println("Your account balance is: " + accountBalance);
        }
        
    }
}
     class main {
        public static main(String[] args) {
            Bank bank = new Bank();
            bank.checkBalance();
            bank.deposit(100);
            bank.checkBalance();
            bank.withdraw(50);
            bank.checkBalance();
            bank.withdraw(200);
        }
    

}
