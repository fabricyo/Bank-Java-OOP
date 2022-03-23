public class AccountCurrent extends Account{

    public AccountCurrent(Client acc) {
        super(acc);
    }

    @Override
    public void print_statement() {
        super.printCommonInfo();
        System.out.println("=== Extrato Conta Corrente ===");
    }
}
