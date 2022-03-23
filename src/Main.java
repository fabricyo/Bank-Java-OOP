public class Main {

    public static void main(String[] args){
        Client client1 = new Client("Jefferson Soarez", "00011122233");
        Client client2 = new Client("Lucas Affonso", "44455566677");

        Account cacc1 = new AccountCurrent(client1);
        Account cacc2 = new AccountCurrent(client2);

        Account sacc1 = new AccountSavings(client1);
        Account sacc2 = new AccountSavings(client2);

        cacc1.deposit(251.51);
        cacc1.transfer(22.1, cacc2);

        sacc2.deposit(8496.22);
        sacc2.transfer(5411, sacc1);

        Bank banco = new Bank("Banco Norte Sudeste");

        banco.addAccount(cacc1);
        banco.addAccount(cacc2);
        banco.addAccount(sacc1);
        banco.addAccount(sacc2);

        banco.printAllAccounts();

    }

}
