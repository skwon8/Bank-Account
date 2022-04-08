public class Program {
    public static void main (String [] args) {

        BankAccount saengsu = new BankAccount();
        BankAccount sage = new BankAccount();

        saengsu.deposit(1000.0, true);
        saengsu.deposit(250000.0, false);
        System.out.println(saengsu.getTotal());

        sage.deposit(20.0, true);
        sage.deposit(2000.0, false);
        System.out.println(sage.getTotal());


        saengsu.withdraw(50000.0, false);
        System.out.println(saengsu.getTotal());
        System.out.println(BankAccount.bankCapital);
    }
}
