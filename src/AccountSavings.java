public class AccountSavings extends Account{

    public AccountSavings(Client acc) {
        super(acc);
    }

    @Override
    public void print_statement() {
        super.printCommonInfo();
        System.out.println("=== Extrato Conta Poupança ===");
    }
}
