import java.util.Random;

public class BankAccount {
    private Double checkings;
    private Double savings;
    private Long accountNumber;
    private static Random random = new Random();
    private static Integer numAccounts = 0;
    public static Double bankCapital = 0D; 

    public BankAccount() {
        BankAccount.numAccounts++;
        accountNumber = generateAccountNumber();
        checkings = 0.0;
        savings = 0.0;
    }

    private Long generateAccountNumber() {
        String number = "";
        for (int i = 0; i < 10; i++) {
            number += random.nextInt(9);
        }
        return Long.parseLong(number);
    }

    public Double getChecking() {
        return checkings;
    }
    public Double setChecking() {
        return checkings;
    }

    public Double getSaving() {
        return savings;
    }
    public Double setSaving() {
        return savings;
    }

    public Double getTotal() {
        return savings + checkings;
    }

    public void deposit (Double moneyInAccount, Boolean isChecking) {
        if (isChecking) {
            checkings += moneyInAccount;
        } else {
            savings += moneyInAccount;
        }
        bankCapital += moneyInAccount;
    }

    public Double withdraw (Double moneyInAccount, Boolean isChecking) {
        if (isChecking) {
            if (checkings < moneyInAccount) {
                return 0.00;
            }
            checkings -= moneyInAccount;
        } else {
            if (savings < moneyInAccount) {
                return 0.00;
            }
            savings -= moneyInAccount;
        }

        bankCapital -= moneyInAccount;

        return moneyInAccount;
    }
}